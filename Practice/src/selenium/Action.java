package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Action {
	
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\Selenium\\SeleniumApp\\selenium-java\\chromedriver_win32\\chromedriver.exe");
	
		 WebDriver driver= new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 //redirecting the URL in browser
		 driver.get("https://www.facebook.com/signup");
		 
		 WebElement firstname = driver.findElement(By.xpath("//*[@name='firstname']"));
		 
		 Actions act =new Actions(driver);
		 
		 act.click(firstname).sendKeys("raju").build().perform();
		 
		 
		 //copy and paste
		 act.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		 act.sendKeys(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		 
		 

}
}