package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WindowHandling {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\Selenium\\SeleniumApp\\selenium-java\\chromedriver_win32\\chromedriver.exe");
	
		 RemoteWebDriver driver= new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 //redirecting the URL in browser
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		
		 //getting window/TAB id by getWindowHandle();
		 String id1= driver.getWindowHandle(); // which will on return only parent id any point we write it
		 System.out.println("Parent id is :"+id1);
		 
		 driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		 
		Set<String> ids =driver.getWindowHandles();
		
		for(String id:ids) {
			System.out.println(id);
			if(!(id.equalsIgnoreCase(id1))) {
			driver.switchTo().window(id);
			}
		}
		
		Thread.sleep(5000);
		driver.switchTo().window(id1);
		
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		
		System.out.println("-----------------------------");
		
		Set<String> winids= driver.getWindowHandles();
		// printing ids 
		for(String winid:winids) {
			
			System.out.println(winid);
		}
		
		int size = winids.size();
		String[] win = new String[size];
		int i =0;
		for(String winid:winids) {
			
			win[i]=winid;
			i++;
		}
		System.out.println("--------------");
		System.out.println(win[1]);
		
		driver.switchTo().window(id1);
		Thread.sleep(5000);
		driver.switchTo().window(win[1]);
		 
	}
}