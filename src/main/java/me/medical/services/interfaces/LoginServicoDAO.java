package me.medical.services.interfaces;

import me.medical.model.Usuario;

public interface LoginServicoDAO {

	Usuario login(String email, String senha);
}
