package testingdiscussion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataProvider {
	@org.testng.annotations.DataProvider(name = "testData")
	public static String[][] dpmethod() throws IOException {
		
		File scr = new File("C:\\Users\\Mallikarjun\\eclipse-workspace\\Practice\\Testdata.xlsx");
		
		FileInputStream fis = new FileInputStream(scr);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 =wb.getSheetAt(0);
		
		int row = sh1.getLastRowNum();
		System.out.println("Total number of rows are:"+row);// last index number of row
		
		int col = sh1.getRow(0).getLastCellNum();
		
		System.out.println("Total number of column are:"+col);// total number of col
		
		String data[][] = new String[row-1][col];
		
		for(int i=1; i<=row; i++)
		{
			for(int j=0; j<col; j++)
			{
				data[i-1][j]= sh1.getRow(i).getCell(j).getStringCellValue();
			}
			
		}
		
		return data;

	}

}
