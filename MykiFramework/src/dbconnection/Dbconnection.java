package dbconnection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Dbconnection {
	
	public Connection con;

		
	
	public Connection Dbconnection() {
		
	    try {
	    	
	    	String connectionurl="jdbc:sqlserver://10.0.23.64:1433;databaseName=MicrosoftDynamicsAX;integratedSecurity=true";
	        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    	Connection con = DriverManager.getConnection(connectionurl);
	        System.out.println("Connected Successfully");
	    } catch (ClassNotFoundException e) {
	  System.out.println("Could not find the database driver " + e.getMessage());
	    } catch (SQLException e) {
	   System.out.println("Could not connect to the database " + e.getMessage());
	    }
	      return con;

	}

}
