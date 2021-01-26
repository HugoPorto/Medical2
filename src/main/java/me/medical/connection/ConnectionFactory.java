package me.medical.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import me.medical.dao.DAOProperties;

public class ConnectionFactory {

	public static Connection openConnection() throws SQLException{
		String url = String.format("jdbc:mysql://%s:%d/%s?useSSL=false&&serverTimezone=UTC", DAOProperties.getServerName(), DAOProperties.getPortNumber(), DAOProperties.getDBName());
		Connection connection = DriverManager.getConnection (url, DAOProperties.getUserName(), DAOProperties.getPassword());
		return connection;
		
	}
}
	