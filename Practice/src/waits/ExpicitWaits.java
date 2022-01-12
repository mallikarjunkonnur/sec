package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpicitWaits {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\Selenium\\SeleniumApp\\selenium-java\\chromedriver_win32\\chromedriver.exe\\");
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		
//		WebDriverWait wait= new WebDriverWait(driver,20);
//		// Waiting until Element mentioned in condition is clickable
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='disable']")));
		
		driver.get("https://www.google.in");
		
		driver.navigate().back();
		
		// Waiting until Element mentioned in condition is visible over the web page
		
		driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
		
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='hidden']")));
		
		driver.get("https://www.google.in");
		
		driver.navigate().back();
		
		

}
}
