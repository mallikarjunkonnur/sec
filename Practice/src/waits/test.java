package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\Selenium\\SeleniumApp\\selenium-java\\chromedriver_win32\\chromedriver.exe\\");
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
//		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
//		
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='disable']")));
//		driver.findElement(By.xpath("//*[@id='disable']")).click();
//		
//		driver.get("https://www.google.in");
		
//		driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='hidden']")));
//		
//		driver.get("https://www.google.in");
		
//		driver.findElement(By.xpath("//*[@id='populate-text']")).click();
//		
//		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[text()='Selenium Webdriver']"), "Selenium Webdriver"));
//		
//		driver.get("https://www.google.in");
		
//		driver.findElement(By.xpath("//*[@id='alert']")).click();
//		wait.until(ExpectedConditions.alertIsPresent());
//		
//		driver.switchTo().alert().accept();
//		driver.get("https://www.google.in");
		
		driver.findElement(By.xpath("//*[@id='checkbox']")).click();
		
		wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath("//*[@id='ch']"), true));
		
		driver.get("https://www.google.in");
		
		
}
}
