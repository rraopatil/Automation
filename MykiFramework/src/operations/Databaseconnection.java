package operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Databaseconnection {

	public Connection conn = null;
	
		 
	public Databaseconnection(String dbName, String dataSourceName){

	  try {
		  
		  System.out.println(dataSourceName);
		 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		  //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		  conn = DriverManager.getConnection(dataSourceName);
		  System.out.println("Connected	 Successfully"); 
		 
	  }
	  catch(ClassNotFoundException e){
		  e.printStackTrace();
		  }

		  catch(SQLException e){
		  e.printStackTrace();;
		  }
		  }
}

			
	//String dbURL = "jdbc:sqlserver://10.0.23.64:1433;databaseName=MicrosoftDynamicsAX;integratedSecurity=true";
	  //String dbURL = "jdbc:sqlserver://10.0.23.64:1433;databaseName=MicrosoftDynamicsAX;user=kamco\ramachandrarao.patil;password=R@mbo1008";
	//Connection conn = DriverManager.getConnection(dbURL);
	//{
	//if (conn != null) {
	  //  System.out.println("Connected");
	//}
	//}
	 // }
	  
	  //catch(ClassNotFoundException e){
		//	e.printStackTrace();
	  //}
	//public Databaseconnection(){
//	}
 //catch (SQLException e) {
		
	//	e.printStackTrace();
	//}

//	public void Databaseconnection(String dbName, String db_userid, String db_password){
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

