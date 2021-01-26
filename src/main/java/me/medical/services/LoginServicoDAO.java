package me.medical.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import me.medical.connection.ConnectionFactory;
import me.medical.exceptions.DAOException;
import me.medical.model.Perfil;
import me.medical.model.Usuario;

public class LoginServicoDAO implements me.medical.services.interfaces.LoginServicoDAO {

	@Override
	public Usuario login(String email, String senha) {
		try (Connection conn = ConnectionFactory.openConnection()) {
			String sql = "SELECT u.id as id, u.nome_responsavel as nome, p.perfil as perfil";
			sql += " FROM usuario u INNER JOIN perfil p INNER JOIN login l ON u.id_perfil = p.id AND u.id_login = l.id";
			sql += " WHERE l.usuario = ? AND l.senha = ? LIMIT 1";
			
			try (PreparedStatement stmt = conn.prepareStatement(sql)) {
				stmt.setString(1, email);
				stmt.setString(2, senha);

				try (ResultSet result = stmt.executeQuery()) {
					Usuario usuario = new Usuario();
					Perfil perfil = new Perfil();
					
					if (result.next()) {
						usuario.setNome(result.getString("nome"));
						perfil.setPerfil(result.getString("perfil"));
						usuario.setPerfil(perfil);
						
						return usuario;
					}
					return null;
				}
			}
		} catch (SQLException e) {
			throw new DAOException(e);
		}
	}
}
