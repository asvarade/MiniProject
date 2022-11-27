package com.Driver;

import java.sql.Connection;
import java.sql.DriverManager;

public class DriverCommen {

Connection connection =null;
	
	public Connection driverload() {
		
		try {
	    //loading class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//getconnection
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","abhi@6934");
		
		}catch (Exception E) {
			E.printStackTrace();
		}
		return connection;
	}
}
