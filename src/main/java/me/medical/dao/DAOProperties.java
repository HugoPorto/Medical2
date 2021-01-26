package me.medical.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DAOProperties {

	private static Properties props = new Properties();

	static {
		try {
			try (InputStream in = new FileInputStream("dao.properties")) {
				props.load(in);
			}
		} catch ( IOException e) {
			throw new ExceptionInInitializerError(e);
		}
	}

	public static String getDAOClassName(String className) {
		return props.getProperty(className);
	}

	public static String getServerName() {
		return props.getProperty("dao.db.serverName");
	}

	public static int getPortNumber() {
		return Integer.parseInt(props.getProperty("dao.db.port"));
	}
	
	public static String getDBName() {
		return props.getProperty("dao.db.dbName");
	}

	public static String getUserName() {
		return props.getProperty("dao.db.userName");
	}

	public static String getPassword() {
		return props.getProperty("dao.db.password");
	}
}
