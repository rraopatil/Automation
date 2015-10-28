package dbconnection;


import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Dbconnection {
	
	private static Connection con;

		
	
	public static void main(String[] args) {
		
	    try {
	    	
	    	String connectionurl="jdbc:sqlserver://10.0.23.64:1433;databaseName=MicrosoftDynamicsAX;integratedSecurity=true";
	        
	    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    	
	    	//String connectionurl="jdbc:sqlserver://10.0.23.64:1433;databasename=MicrosoftDynamicsAX";
	    	Connection con = DriverManager.getConnection(connectionurl);{
	    		if (con != null) {
	    			  System.out.println("Connected");
	    			}
	    			}
	    	
             java.sql.Statement st =  con.createStatement();
			
			String sqlStr = "select activitynumber,ntscardpan from smmactivities where ntsweborderreference='INT5700138'";

			ResultSet rs = ((java.sql.Statement) st).executeQuery(sqlStr);
			
			while (rs.next()) {
				  String SRnumber = rs.getString("activitynumber");
				  String cardpan=rs.getString("ntscardpan");
				  System.out.println(cardpan+" "+SRnumber);
				  
			}
				  
			//if (rs != null){
				
				//System.out.println(rs);
				
			//}
	    	
	    	//Connection con = DriverManager.getConnection(connectionurl, "ramachandrarao.patil", "R@mbo1008");
	        		
	        		//getConnection(connectionurl,"ramachandrarao.patil","R@mbo1008");
	     // System.out.println("Connected Successfully");


	    } catch (ClassNotFoundException e) {
	  System.out.println("Could not find the database driver " + e.getMessage());
	    } catch (SQLException e) {
	   System.out.println("Could not connect to the database " + e.getMessage());
	    }

	}

}
