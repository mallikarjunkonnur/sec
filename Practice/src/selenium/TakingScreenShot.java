package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import Utility.Screenshot;

public class TakingScreenShot {
	
	

	public static void main(String[] args) throws  InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Velocity\\Selenium\\SeleniumApp\\selenium-java\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.flipkart.com");
		
//	 TakesScreenshot scrshot = (TakesScreenshot)driver;

//	 File source =scrshot.getScreenshotAs(OutputType.FILE);
//	 
//	 File destination = new File("E:\\Velocity\\Selenium\\ScreenShot\\first.png") ;
//	 
//	 FileHandler.copy(source, destination);
		
		Thread.sleep(2000);
	Screenshot.captureScreenshot(driver,"Flip");
	

	
	}

}
