package com.ESEO;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class ConnectMySQL {
	
	private static final String DB_URL = "jdbc:mysql://localhost/ville_france";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "";
	
	
    public static Connection getConnection(){		

		Connection connection = null;
		MysqlDataSource mysqlDS = null;

		mysqlDS = new MysqlDataSource();
		mysqlDS.setURL(DB_URL);
		mysqlDS.setUser(DB_USER);
		mysqlDS.setPassword(DB_PASSWORD);
		
		System.out.println("Connexion établie");

        try {
        	connection = mysqlDS.getConnection();
		} catch (SQLException e) {
			System.out.println("Erreur pendant la creation de la connexion à la BDD.");
			e.printStackTrace();
		}
		return connection;
    }

}
