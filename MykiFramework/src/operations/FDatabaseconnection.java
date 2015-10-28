package operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FDatabaseconnection {

	public Connection conn = null;
	
	public FDatabaseconnection(){
 
try{
  
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
  
    String connectionurl="jdbc:odbc:MicrosoftDynamicsAX";
  
  conn = DriverManager.getConnection(connectionurl,"ramachandrarao.patil","R@mbo1008");
  System.out.println("Connected Successfully"); 
    }

	catch(ClassNotFoundException e){
		System.out.println("Class Not Found Exception: " + e.toString());
	}

		catch(SQLException e){
	e.printStackTrace();
	System.out.println("SQL Exception: " + e.getMessage());
	}
	}
		 
	
}



//	public FDatabaseconnection(String dbName, String db_userid, String db_password){
//	this.dbName = dbName;
//	try{
//		  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//	       this.conn = DriverManager.getConnection(dbName,db_userid,db_password);
//	      System.out.println("Connected Successfully"); 
//	     }

	//catch(ClassNotFoundException e){
	///e.printStackTrace();
//	}

	//catch(SQLException e){
	//e.printStackTrace();
	//}
	//}
//}
//}

