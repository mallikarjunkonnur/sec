package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicComponents2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\Selenium\\SeleniumApp\\selenium-java\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //parent ref_var= new child object
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		driver.get("https://www.google.co.in");
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.navigate().forward();
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.manage().window().minimize();
		
		Thread.sleep(2000);
		driver.close();
		
		
	}
	
}
