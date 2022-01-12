package pomTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pomPage.LoginPage;

public class BaseTest {
	
	 static WebDriver driver;
	 
	 LoginPage lp;
	 
	 
	@BeforeSuite
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\Selenium\\SeleniumApp\\selenium-java\\chromedriver_win32\\chromedriver.exe");
		
		 driver= new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 //redirecting the URL in browser
		 driver.get("https://kite.zerodha.com/");
	}
	
	@BeforeClass
	public void object() {
		
		 lp = new LoginPage(driver);
		 
		 
	}

}
