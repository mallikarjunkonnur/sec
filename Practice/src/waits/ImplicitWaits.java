package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaits {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\Selenium\\SeleniumApp\\selenium-java\\chromedriver_win32\\chromedriver.exe\\");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/search?gs_ssp=eJzj4tDP1TcwscwpMmD04sxOLMpLLEnMTgQAQQ0Giw&q=karnataka&oq=Kar&aqs=chrome.1.69i57j46i433i512j46i131i199i291i433i512j0i131i433i512j0i433i512j0i131i433i512j0i512j69i60.7320j0j7&sourceid=chrome&ie=UTF-8");
	
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		// actually it is present in next page  when we click on the next than
		driver.findElement(By.xpath("//*[text()='Karnataka Information Commission']")).click();
		
		driver.findElement(By.xpath("//*[text()='Karnataka Government']")).click();
		
		
}
}
