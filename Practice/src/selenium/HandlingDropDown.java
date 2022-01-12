package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {
	
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
		 
		 //Selecting DropDown Values
		 
		 WebElement jobTitle = driver.findElement(By.xpath("//*[@name='empsearch[job_title]']"));
		 
		 Select seljob = new Select(jobTitle);
		 
		 //selecting by 1. selectByVisibleText();
		 seljob.selectByVisibleText("Automation Tester");
		 
		//selecting by 2. selectByValue();
		 WebElement empstatus = driver.findElement(By.xpath("//*[@name='empsearch[employee_status]']"));
		 
		 Select selstatus = new Select(empstatus);
		 
		 selstatus.selectByValue("2");
		 
		//selecting by 3. selectByIndex();
		 WebElement subjob = driver.findElement(By.xpath("//*[@name='empsearch[sub_unit]']"));
		 
		 Select selsubjob = new Select(subjob);
		 
		 selsubjob.selectByIndex(6);
		 

}
}
