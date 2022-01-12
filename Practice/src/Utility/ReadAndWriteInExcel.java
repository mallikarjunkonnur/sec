package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAndWriteInExcel {
	
	public static String getDataFromExcel(int row,int column) throws IOException {
		
		File source = new File("C:\\Users\\Mallikarjun\\Desktop\\TestData.xlsx");
		
		FileInputStream fis = new FileInputStream(source);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheet("Testsheet");
		
		DataFormatter df = new DataFormatter();
		String value = df.formatCellValue(sh1.getRow(row).getCell(column));
		
		return value;
	}
	
	public static void writeInExcel(int row,int column,String status) throws IOException {
		
		File source = new File("C:\\Users\\Mallikarjun\\Desktop\\Testdata.xlsx");
		
		FileInputStream fis = new FileInputStream(source);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheet("Testsheet");
		
		File fout = new File("C:\\Users\\Mallikarjun\\Desktop\\Testdata.xlsx");
		
		FileOutputStream fos = new FileOutputStream(fout);
		
		sh1.getRow(row).createCell(column).setCellValue(status);
		
		wb.write(fos);
		
		
	}
	
	
	

}
