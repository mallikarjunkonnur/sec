package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromConfig {
	
	public static String getDataConfig(String keyword) throws IOException {
		
		Properties prop = new Properties();
		
		FileInputStream fs = new FileInputStream("c:\\Users\\Mallikarjun\\eclipse-workspace\\Practice\\config.properties");
		
		prop.load(fs);
		
		String keyvalue = prop.getProperty(keyword);
		
		return keyvalue;
	}

}
