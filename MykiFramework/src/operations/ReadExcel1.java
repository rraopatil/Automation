package operations;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel1 extends ExcelDataConfig {

	public ReadExcel1(String ExcelSheetPath) {
		super(ExcelSheetPath);
		// TODO Auto-generated constructor stub
	}

	public static void  main(String[] args)throws Exception{
	File src=new File("C:/JavaProjects/Automation/Automation_Testdata/Testdata.xlsx");
	FileInputStream fis = new FileInputStream(src);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet1=wb.getSheetAt(0);
	int rowcount= sheet1.getLastRowNum();
	System.out.println("Total of row count"+ (rowcount+1));

	for (int i=1;i<=rowcount;i++){
		
		String data=sheet1.getRow(i).getCell(0).getStringCellValue();
		
		System.out.println("Data for username"+data);
		
	    Row row = sheet1.getRow(i);
		
		 for (int j = 0; j < row.getLastCellNum(); j++) {
	
			
		 
		 
		 }
		
	}
	}
	
}