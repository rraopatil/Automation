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
			sheet1=wb.getSheetAt(0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	
	public String getData(String sheetnumber,int row, int column)
	{
		String data=sheet1.getRow(row).getCell(column).getStringCellValue();
		
		return data;
	}
	//Returns the Number of Rows
	public static int RowCount()
	{	
		return  wrksheet.getLastRowNum();
	}

}
