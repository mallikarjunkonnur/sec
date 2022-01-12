package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenNewTab {


	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\Selenium\\SeleniumApp\\selenium-java\\chromedriver_win32\\chromedriver.exe");
	
		 WebDriver driver= new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 //redirecting the URL in browser
		 driver.get("https://www.google.co.in/");
		
		 driver.get("https://www.google.co.in/");
		 
		 Actions act = new Actions(driver);
		 
		 act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("(//*[@class='gb_f'])[1]"))).build().perform();
		 
		 
		 
		 
//		 act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys(Keys.TAB)
//		 .keyUp(Keys.CONTROL).keyUp(Keys.SHIFT).build().perform();
//
//
//		 act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys(Keys.TAB)
//		 .keyUp(Keys.CONTROL).keyUp(Keys.SHIFT).build().perform();
}
}
