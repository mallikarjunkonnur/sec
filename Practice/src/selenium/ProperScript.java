package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Utility.ReadAndWriteInExcel;

public class ProperScript {
	
	static WebDriver driver;
	
	@BeforeMethod
	public void luanch() {
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\Selenium\\SeleniumApp\\selenium-java\\chromedriver_win32\\chromedriver.exe");
		
		 driver= new ChromeDriver();
		 
		 driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void luanchClose() {
		
		 
		 driver.close();
		
	}

	@Test
	public void validCredential() throws IOException {
		
		 //redirecting the URL in browser
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 
		 //entering username
		 driver.findElement(By.id("txtUsername")).sendKeys(ReadAndWriteInExcel.getDataFromExcel(1,0));
		 
		 //entering the password
		 driver.findElement(By.id("txtPassword")).sendKeys(ReadAndWriteInExcel.getDataFromExcel(1,1)); 
		 
		 //login
		 driver.findElement(By.xpath("//*[@name='Submit']")).click();
		 
		 String presentUrl = driver.getCurrentUrl();
		 
		 SoftAssert sa = new SoftAssert();
		 
		 sa.assertEquals(presentUrl,"https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		 sa.assertAll();
	}
	
	@Test
	public void invalidCredential() throws IOException {
		
		 //redirecting the URL in browser
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 
		 //entering username
		 driver.findElement(By.id("txtUsername")).sendKeys(ReadAndWriteInExcel.getDataFromExcel(2,0));
		 
		 //entering the password
		 driver.findElement(By.id("txtPassword")).sendKeys(ReadAndWriteInExcel.getDataFromExcel(2,1)); 
		 
		 //login
		 driver.findElement(By.xpath("//*[@name='Submit']")).click();
		 
		 String presentUrl = driver.getCurrentUrl();
		 
		 SoftAssert sa = new SoftAssert();
		 
		 sa.assertEquals(presentUrl,"https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		 sa.assertAll();
	}

}
