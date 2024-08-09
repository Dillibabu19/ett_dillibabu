package com.Connection_db;

import java.sql.Connection;
import java.sql.DriverManager;

public class Db_emp_con {
	public static Connection connect_data() {

	      String JdbcURL = "jdbc:mysql://localhost:3306/tt";
	      String Username = "root";
	      String password = "d@1234";
	      Connection con = null;
	      try {
	    	 Class.forName("com.mysql.jdbc.Driver");
	    
	         con=DriverManager.getConnection(JdbcURL, Username, password);
	        
	         
	        
	      }
	      catch(Exception e) {
	    	  System.out.println("Error");
	         e.printStackTrace();
	      }
	      return con;
		
	}
}
