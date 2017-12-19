package com.ESEO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Requests {
	
	public void findAllCities() {

		try {
			//Connection con = JDBCConfigurationSol2.getConnection();
			Connection con = ConnectMySQL.getConnection();
			Statement statement = con.createStatement();
			 
			ResultSet resultSet = statement.executeQuery("SELECT * FROM ville_france where code_postal=01400");
			while(resultSet.next()){
		        System.out.println("Nom Commune : " + resultSet.getString("Nom_commune") );			
			}		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
