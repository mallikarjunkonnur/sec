package testingdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ParallelTescases {
	

	@Test
	public void google()
	{
		
		
			System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\Selenium\\SeleniumApp\\selenium-java\\chromedriver_win32\\chromedriver.exe");
		
			WebDriver	driver = new ChromeDriver();
		
		// redirecting to a URL
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
	}	
	@Test
	public void facebook()
	{
		
		
			System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\Selenium\\SeleniumApp\\selenium-java\\chromedriver_win32\\chromedriver.exe");
		
			WebDriver	driver = new ChromeDriver();
		
		// redirecting to a URL
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
	}	
	@Test
	public void insta()
	{
		
		
			System.setProperty("webdriver.edge.driver", "E:\\Velocity\\Selenium\\SeleniumApp\\selenium-java\\chromedriver_win32\\msedgedriver.exe");
		
			WebDriver	driver = new EdgeDriver();
		
		// redirecting to a URL
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com");
		
	}	
	@Test
	public void flipkart()
	{
		
		
			System.setProperty("webdriver.edge.driver", "E:\\Velocity\\Selenium\\SeleniumApp\\selenium-java\\chromedriver_win32\\msedgedriver.exe");
		
			WebDriver	driver = new EdgeDriver();
		
		// redirecting to a URL
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		
	}	


}
