package me.medical.dao;

public class DAOFactory {

	public static Object createDAO(String className) {
		try {
			String daoClass = DAOProperties.getDAOClassName(className);
			Object newInstance = Class.forName(daoClass).getDeclaredConstructor().newInstance();
			return newInstance;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
