package main.java.de.devch.sandbox.init;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * The Class SandboxDatabaseCreateFromScratch.
 */
public class SandboxDatabaseCreateFromScratch {

	/** The i. */
	private final int i = 5;

	/** The x. */
	private final int x = 10;

	/**
	 * The main method.
	 * 
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		final String driver = "com.mysql.jdbc.Driver";

		final String jdbcMsql = "jdbc:mysql://";
		final String server = "localhost";
		final String port = ":3306/";

		final String userName = "root";
		final String password = "test";

		final String dbName = "sandbox";

		final String jpaSource = "sandbox";

		try {
			Class.forName(driver).newInstance();
			Connection sqlConnection = DriverManager.getConnection(jdbcMsql + server + port, userName, password);
			Statement statement = sqlConnection.createStatement();

			int Result = statement.executeUpdate("DROP DATABASE IF EXISTS " + dbName);
			System.out.println("Result: " + Result);

			Result = statement.executeUpdate("CREATE DATABASE " + dbName);
			System.out.println("Result: " + Result);

			statement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		EntityManagerFactory emf = Persistence.createEntityManagerFactory(jpaSource);
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.getTransaction().commit();
	}

	/**
	 * Drive.
	 * 
	 * @return the int
	 */
	public int drive() {
		int result = i + x;
		return result;
	}
}
