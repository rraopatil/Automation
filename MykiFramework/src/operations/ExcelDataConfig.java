package operations;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	static Sheet wrksheet;
	static Workbook wrkbook =null;;
	//Create a Constructor
	public ExcelDataConfig(String ExcelSheetPath)
	{
		//Initialize
		try {
			File src=new File(ExcelSheetPath);
			
			FileInputStream fs = new FileInputStream(src);
			wb=new XSSFWorkbook(fs);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	
	public String getData(int sheetnumber,int row, int column)
	{
		
		sheet1=wb.getSheetAt(sheetnumber);
		
		String data=sheet1.getRow(row).getCell(column).getStringCellValue();
		
		return data;
	}
	//Returns the Number of Rows
	public static int RowCount()
	{	
		return  wrksheet.getLastRowNum();
	}

	
	
	public  String username(int sheetnumber)
	{
		String username1=null;
		sheet1=wb.getSheetAt(sheetnumber);
		int rowcount= sheet1.getLastRowNum();
		for (int i=1;i<=rowcount;i++)
		{
			 Row row = sheet1.getRow(i);
		    username1=sheet1.getRow(i).getCell(0).getStringCellValue();
		
		  //System.out.println(username1);
	}
		
		 return username1;	
		
}
	

	public  String password(int sheetnumber)
	{
		String password1=null;
		
		sheet1=wb.getSheetAt(sheetnumber);
		
		int rowcount= sheet1.getLastRowNum();
		
		
		
		for (int i=1;i<=rowcount;i++){
			
			Row row = sheet1.getRow(i);
			
			//String data=sheet1.getRow(i).getCell(0).getStringCellValue();
			
			//System.out.println("Data for username"+data);
			
		    			
			 for (int j = 0; j < row.getLastCellNum(); j++) {
		
				 
				 password1=row.getCell(j).getStringCellValue();
			 }
		}
		
		 return password1;	
		
}
	
	
}