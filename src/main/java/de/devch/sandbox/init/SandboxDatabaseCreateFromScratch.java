/*
 * Copyright (c) 2012 Christian Soth
 * See the file license.txt for copying permission.
 */

package main.java.de.devch.sandbox.init;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SandboxDatabaseCreateFromScratch {

	int i = 5;
	int x = 10;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String driver = "com.mysql.jdbc.Driver";

		String jdbcMsql = "jdbc:mysql://";
		String server = "localhost";
		String port = ":3306/";

		String userName = "root";
		String password = "test";

		String dbName = "sandbox";

		String jpaSource = "sandbox";
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

	public int drive() {
		int result = i + x;
		return result;
	}
}
