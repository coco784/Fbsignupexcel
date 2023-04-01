package week9.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static String[][] readData() throws IOException {
		XSSFWorkbook wbook = new XSSFWorkbook("Data/signup.xlsx");
	    XSSFSheet sheet = wbook.getSheet("Sheet1");
	    int rowcount = sheet.getLastRowNum();
	    short columncount= sheet.getRow(0).getLastCellNum();
	    System.out.println(rowcount);
	    System.out.println(columncount);
	   
		String[][] data = new String[rowcount][columncount];
		for (int i=1;i<=rowcount;i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<columncount;j++) {
				
				XSSFCell cell = row.getCell(j);
				System.out.println(cell.getStringCellValue());
				data[i-1][j]=cell.getStringCellValue();
				
			}}
			wbook.close();
			return data;
		
		
	    
	
	
	
	
	}	
	

}
