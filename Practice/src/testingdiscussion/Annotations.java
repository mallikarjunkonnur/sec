package testingdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
//	System.setProperty("webdriver.chrome.driver","E:\\Velocity\\Selenium\\SeleniumApp\\selenium-java\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	@BeforeSuite
	public void launchBrowser() {
		
		
		driver.manage().window().maximize();
	}
	
	@BeforeTest
	public void getUrl() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

}
