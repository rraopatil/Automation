package smoketests;

import java.beans.Statement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import login.Login;
import cpsubmenu.Cpsubmenulist;
import dbconnection.Dbconnection;
import excelimport.DataFieldValues;
import excelimport.ReadData;
import operations.Operations;



public class OneofTopupmoney extends ReadData {
	protected String GetcardPAN;
	protected String GetTopupamount;
	protected String Getcreditcardnumber1;
	protected String Getcreditcardnumber2;
	protected String Getcreditcardnumber3;
	protected String Getcreditcardnumber4;
	protected String GetExpirymonth;
	protected String GetExpiryYear;
	protected String GetCVV;
	protected static Connection con;
	
	
	
	
public OneofTopupmoney() throws Exception {
		super();
		
	}

public WebDriver mydriver;
public List<DataFieldValues> datasheetList=readDataFromExcel("C:/JavaProjects/Automation/Automation_Testdata/Testdata.xlsx","Sheet1");
	
	@Before
	public void beforeTest() throws InterruptedException// here in this case, prerequisite is open the browser along with url
	{
		mydriver = new FirefoxDriver();//my driver is object of class FirefoxDriver
		mydriver.get("https://10.0.23.61/NTSWebPortal/login.aspx");
		Login login = new Login(mydriver);
		mydriver.manage().window().maximize();
		
}
	

	@After
	public void afterTest()
	{
	
	}
	
	@Test
	public void topup() throws IOException, InterruptedException, SQLException
	{
		Login login = new Login(mydriver);
		if (datasheetList.size()==0){
			System.out.println("No Data found");
			 
	
		}
		else{
			
			for (DataFieldValues gData :datasheetList ){//enhanced for loop example for (int myvalue : myArray)
	
		Cpsubmenulist mysubmenu = new Cpsubmenulist(mydriver);
		mysubmenu.AnonymousTopup().click();
		
		GetcardPAN=gData.getCardPAN();
		GetTopupamount=gData.getTopupamount();
		Getcreditcardnumber1=gData.getCreditcardnumber1();
		Getcreditcardnumber2=gData.getCreditcardnumber2();
		Getcreditcardnumber3=gData.getCreditcardnumber3();
		Getcreditcardnumber4=gData.getCreditcardnumber4();
		GetExpirymonth=gData.getExpirymonth();
		GetExpiryYear=gData.getExpiryYear();
		GetCVV=gData.getCVV();
		Operations operations = new Operations(mydriver);
		operations.Anonymoustopupmykimoney().sendKeys(GetcardPAN);
		operations.Submitnext().click();
		operations.Topupmykimoney().click();
		operations.Submitrequest().click();
		operations.Chooseamount().selectByVisibleText(GetTopupamount);
		Thread.sleep(4000);
		operations.Submitrequest().click();
		Thread.sleep(4000);
		operations.Creditcard1().sendKeys(Getcreditcardnumber1);
		operations.Creditcard2().sendKeys(Getcreditcardnumber2);
		operations.Creditcard3().sendKeys(Getcreditcardnumber3);
		operations.Creditcard4().sendKeys(Getcreditcardnumber4);
		operations.Creditcardmonth().selectByVisibleText(GetExpirymonth);
		operations.Creditcardyear().selectByVisibleText(GetExpiryYear);
		operations.CreditcardCVV().sendKeys(GetCVV);
		operations.Submitrequest().click();
		Thread.sleep(5000);
		operations.Submitrequest().click();
		Thread.sleep(5000);
		//Logout logout = new Logout(mydriver);//using constructor, we are initializing the object 
		//logout.LogoutButton().click();
	
		String webordernumber=operations.weborderref().getText();
		//System.out.println(GetcardPAN+"  "+ webordernumber);
		String connectionurl="jdbc:sqlserver://10.0.23.64:1433;databaseName=MicrosoftDynamicsAX;integratedSecurity=true";
        try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e1) {
		
			e1.printStackTrace();
		}
	  
		try {
			con = DriverManager.getConnection(connectionurl);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}{
	    		if (con != null) {
	    		
	    			  java.sql.Statement st =  con.createStatement();
	    			  
	    			   String sqlStr = "select activitynumber,ntscardpan,ntsweborderreference from smmactivities where createddatetime>GETDATE()-1 and purpose like 'Request For Add Value - Internet' order by recid desc";
	    			
	    			  ResultSet rs = ((java.sql.Statement) st).executeQuery(sqlStr);
	    			 	 
	    			
	    				  while(rs!= null && rs.next())
	    			  {
	    				
	    					  String SRnumber = rs.getString("activitynumber");
	    					  String cardpan=rs.getString("ntscardpan");
	    					  String reference=rs.getString("ntsweborderreference");
	    					
	    						if (GetcardPAN.equals(cardpan))
	    						{
	    							System.out.println(cardpan+" "+SRnumber+" "+reference);
	    							break;
	    						}
	    					
	    				    					  
	    			  }//end of while loop
	    		rs.close();	
	    		}
	    			  
	    			  
	    			  
		}
			}
		}
	}
}

		
		
				 
		
			
		
			
		
        


	






