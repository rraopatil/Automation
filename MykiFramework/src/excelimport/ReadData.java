package excelimport;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.DataFormatter;
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
			DataFormatter df = new DataFormatter();
			cell = (XSSFCell) row.getCell(0);
			datasheet.setUserName(cell.getStringCellValue());
			cell = (XSSFCell) row.getCell(1);
			datasheet.setPassword(cell.getStringCellValue());
			cell = (XSSFCell) row.getCell(2);
			String cardpan = df.formatCellValue(cell);
			datasheet.setCardPAN(cardpan); //.getStringCellValue());
			cell = (XSSFCell) row.getCell(3);
			String topupamt = df.formatCellValue(cell);
			
			datasheet.setTopupamount(topupamt);
			
			cell = (XSSFCell) row.getCell(4);
			String cc1 = df.formatCellValue(cell);
			datasheet.setCreditcardnumber1(cc1);
			
			cell = (XSSFCell) row.getCell(5);
			String cc2 = df.formatCellValue(cell);
			datasheet.setCreditcardnumber2(cc2);
			
			cell = (XSSFCell) row.getCell(6);
			String cc3 = df.formatCellValue(cell);
			datasheet.setCreditcardnumber3(cc3);
			
			cell = (XSSFCell) row.getCell(7);
			String cc4 = df.formatCellValue(cell);
			datasheet.setCreditcardnumber4(cc4);
			
			//datasheet.setCreditcardnumber4(cell.getStringCellValue());
			cell = (XSSFCell) row.getCell(8);
			datasheet.setExpirymonth(cell.getStringCellValue());
			
			cell = (XSSFCell) row.getCell(9);
			String ccyear = df.formatCellValue(cell);
			datasheet.setExpiryYear(ccyear);
			
			//datasheet.setExpiryYear(cell.getStringCellValue());
			cell = (XSSFCell) row.getCell(11);
			String ccv = df.formatCellValue(cell);
					
			datasheet.setCVV(ccv);
			datasheetList.add(datasheet);
			
		}
		
	return datasheetList;
	}
	
	
	
}
