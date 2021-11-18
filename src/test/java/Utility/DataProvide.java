package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataProvide {

public static Object[][] getTestData(String sheetName) throws IOException {
		String path=" ";
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook book=new XSSFWorkbook(fis);
		XSSFSheet sheet1=book.getSheet(sheetName);
		
		int row=sheet1.getLastRowNum();
		int col=sheet1.getRow(0).getLastCellNum();
		Object[][] data=new Object[row][col];
		
		for(int r=0; r<row; r++) {
			for(int c=0; c<col;c++) {
				data[r][c]=sheet1.getRow(r+1).getCell(c).toString();
			}
		}
		return data;		
}
}
