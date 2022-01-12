package selenium;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class ReadConfigFile {
	
  public static void main(String[] args) throws Exception {
	Properties pp= new Properties();
	
	FileReader fr = new FileReader("C:\\Users\\Mallikarjun\\eclipse-workspace\\Practice\\config.properties");
//	try {
//	pp.load(fr);
//	}
//	catch(Exception e) {
//		
//	}
	
	pp.load(fr);
	
	System.out.println(pp.getProperty("url"));
  }
}
