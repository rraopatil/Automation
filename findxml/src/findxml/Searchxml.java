package findxml;
import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Searchxml {

	
	  //  DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
	    //String dateString = null;
		//Date myDate = dateFormat.parse(dateString);
	   // Date oneDayBefore = new Date(myDate.getTime() - 2);
	    //String result = dateFormat.format(oneDayBefore);
	
	    
	    
    public static void main(String[] args) throws ParseException {
   
  String pathToScan = "//10.0.23.54/xfer/TRANSFERED";
  String target_file ;  // fileThatYouWantToFilter
  String name = "DSACCH";
  name = name.concat("10292015");
  File folderToScan = new File(pathToScan); 
    	
    File[] listOfFiles = folderToScan.listFiles();

 for (int i = 0; i < listOfFiles.length; i++) {
        if (listOfFiles[i].isFile()) {
            target_file = listOfFiles[i].getName();
            if (target_file.startsWith(name) &&  target_file.endsWith(".xml"))
                {
            //You can add these files to fileList by using "list.add" here
                 System.out.println("found" + " " + target_file); 
            }
       }
 }    
}

}
