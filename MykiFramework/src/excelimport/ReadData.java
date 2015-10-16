package excelimport;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.Row;



public class ReadData {

	public ReadData() throws Exception {
		super();
		
		
	}
	
	int row_count;
	DataFieldValues datasheet=null;
	protected List<DataFieldValues>datasheetList=new ArrayList<DataFieldValues>();
	Row row=null;
	XSSFCell cell=null;
	public List<DataFieldValues>readDataFromExcel(String filepath, String sheetname) throws Exception{
		FileInputStream inputStream=new FileInputStream(filepath);
		XSSFWorkbook workbook=new XSSFWorkbook(inputStream);
		XSSFSheet sheet=workbook.getSheet(sheetname);
		row_count=sheet.getLastRowNum();
		for (int i=1;i<=row_count;i++){
			row=sheet.getRow(i);
			datasheet= new DataFieldValues();
			cell = (XSSFCell) row.getCell(0);
			datasheet.setUserName(cell.getStringCellValue());
			cell = (XSSFCell) row.getCell(1);
			datasheet.setPassword(cell.getStringCellValue());
			datasheetList.add(datasheet);
			
		}
		
	return datasheetList;
	}
	
	
	
}
