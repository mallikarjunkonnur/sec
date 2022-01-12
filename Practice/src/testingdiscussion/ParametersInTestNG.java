package testingdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersInTestNG {
	
	static WebDriver driver;
	@Parameters("browsername") 
	@Test
	public void launchBrowser(String browser) {
	System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\Selenium\\SeleniumApp\\selenium-java\\chromedriver_win32\\chromedriver.exe");

	if(browser.equalsIgnoreCase("chrome"))
	{
		driver=new ChromeDriver();
	}else {
		System.out.println("SORRY");
	}
	
	}

}
