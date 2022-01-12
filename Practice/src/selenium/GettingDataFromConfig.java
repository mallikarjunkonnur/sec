package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.ReadDataFromConfig;

public class GettingDataFromConfig {
	
	
	public static void main(String[] args) throws IOException {
		
		 System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\Selenium\\SeleniumApp\\selenium-java\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			 
			 driver.manage().window().maximize();
			 //redirecting the URL in browser
			 driver.get(ReadDataFromConfig.getDataConfig("url"));
			 
			 //entering username
			 driver.findElement(By.id("txtUsername")).sendKeys(ReadDataFromConfig.getDataConfig("username"));
			 
			 //entering the password
			 driver.findElement(By.id("txtPassword")).sendKeys(ReadDataFromConfig.getDataConfig("password")); 
			 
			 //login
			 driver.findElement(By.xpath("//*[@name='Submit']")).click();
			 
		
	}

}
