package testingdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PracticeSoftAssert {
	static WebDriver driver;
	@Test
	public void testCase1()
	{
        System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\Selenium\\SeleniumApp\\selenium-java\\chromedriver_win32\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		// redirecting to a URL
				driver.manage().window().maximize();
				
				
				driver.get("https://opensource-demo.orangehrmlive.com/");
				
				driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Addmin");
				
				driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
				
				
				driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
				
		WebElement message = driver.findElement(By.xpath("//*[@id='spanMessage']"));
				
				String messagestring = message.getText();
				
				System.out.println(messagestring);
				
				String expected = "Invalid Credentiials";
				
				Assert.assertEquals(messagestring, expected);
				

	
	}
	
	@Test(dependsOnMethods = "testCase1")
	
	public void testCase2()
	{
	Reporter.log("First line", true);
	
	SoftAssert sa = new SoftAssert();
	
	sa.assertTrue(true, "Test case failed");
	
	Reporter.log("second line", true);
	
	sa.assertEquals("abc", "abc");
	
	Reporter.log("Third line", true);
		
	sa.assertAll();
	}


}
