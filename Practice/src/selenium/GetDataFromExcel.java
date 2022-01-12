package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetDataFromExcel {
	
	
	public static void getDataFromExcel() throws IOException {
		
		File source = new File("C:\\Users\\Mallikarjun\\Desktop\\Testdata.xlsx");
		
		FileInputStream fis = new FileInputStream(source);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheet("Testsheet");
		
		DataFormatter df = new DataFormatter();
		
		String numvalue = df.formatCellValue(sh1.getRow(2).getCell(0));
		System.out.println(numvalue);
		
		String value = sh1.getRow(1).getCell(0).getStringCellValue();
		
		System.out.println(value);
		
		CellType chk = sh1.getRow(1).getCell(0).getCellType();
		
		System.out.println(chk);
	}
			
public static void main(String[] args) throws IOException {
	getDataFromExcel();
}		

}
