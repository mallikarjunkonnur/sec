package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScrollingByJavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\Selenium\\SeleniumApp\\selenium-java\\chromedriver_win32\\chromedriver.exe");
	
		 RemoteWebDriver driver= new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 //redirecting the URL in browser
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 
		 //entering username
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 
		 //entering the password
		 driver.findElement(By.id("txtPassword")).sendKeys("admin123"); 
		 
		 //login
		 driver.findElement(By.xpath("//*[@name='Submit']")).click();
		
		 //going to PIM
		 WebElement pim= driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']"));
		 pim.click();
		 
		 //For scrolling we need JavascriptExecutor and we are casting the driver from WebDriver to JavascriptExecutor
		 //with the help of executScript() method
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 
		 js.executeScript("window.scrollBy(0,500)");
		 
		 Thread.sleep(2000);
		 
		 js.executeScript("window.scrollBy(0,-500)");
		 
		 WebElement checkbox = driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_58']"));
		 
		 js.executeScript("arguments[0].scrollIntoView();",checkbox);
		 
		 js.executeScript("arguments[0].click();",checkbox);
		 
	//	 js.executeScript("arguments[0].value='text';", WebElement_name);
}
}