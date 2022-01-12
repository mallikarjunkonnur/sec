package testingdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecutionAndParameterOfBrowsers {
	
	static WebDriver driver;
	@Parameters("Brower_name")
	@Test
	public void launchBrowser(String browsername)
	{
		
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\Selenium\\SeleniumApp\\selenium-java\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		// redirecting to a URL
		driver.manage().window().maximize();
		
		}
		
		else if(browsername.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "E:\\Velocity\\Selenium\\SeleniumApp\\selenium-java\\chromedriver_win32\\msedgedriver.exe");
			
			driver = new EdgeDriver();
			
			// redirecting to a URL
			driver.manage().window().maximize();
		}

	}
	
	@Test
	public void testcase1() {
		
		System.out.println("Testcase 1 from ParallelExecutionAndParameterOfBrowsers");
		
	}
}
