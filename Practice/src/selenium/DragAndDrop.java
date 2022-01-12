package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\Selenium\\SeleniumApp\\selenium-java\\chromedriver_win32\\chromedriver.exe");
	
		 WebDriver driver= new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 //redirecting the URL in browser
		 driver.get("https://jqueryui.com/droppable/");
		 
		 WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		 
		 driver.switchTo().frame(iframe);
		 
		 WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']"));
		 
		 WebElement drop = driver.findElement(By.xpath("//*[@id='droppable']"));
		 
		 Actions act = new Actions(driver);
		 
		// act.dragAndDrop(drag, drop).perform();
		 
		 act.clickAndHold(drag).moveToElement(drop).release().build().perform();
		 
		 driver.switchTo().parentFrame();
		 
}
}
