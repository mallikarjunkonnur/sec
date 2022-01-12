package selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicComponents  {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\Selenium\\SeleniumApp\\selenium-java\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver= new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 //redirecting the URL in browser
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 
		 //entering username
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 
		 //entering the password
		 driver.findElement(By.id("txtPassword")).sendKeys("admin123"); 
		 
		 //login
		 driver.findElement(By.xpath("//*[@name='Submit']")).click();
		 
		 //getting current page URL by getCurrentUrl();
		 String currentUrl=driver.getCurrentUrl();
		 System.out.println("Current URL:"+currentUrl);
		 
		 //getting Title by getTitle();
		 String title = driver.getTitle();
		 System.out.println("Title : "+title);
		 
		 //going to PIM
		WebElement pim= driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']"));
		 pim.click();
		 
		 //Selecting one particular checkbox
	//	 driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_63']")).click();
	
	// Selecting multiple checkbox in one time
		 List<WebElement> checkboxes = driver.findElements(By.xpath("//*[contains(@id,'ohrmList_chkSelectRecord_')]"));
	
	//we can find the size of the WebElements by size();
		 int size=checkboxes.size();
	System.out.println("Size of WebElements is :"+size);
	
		//to select all the checkboxes at one time we'll use foreach loop
		for(WebElement checkbox:checkboxes) {
				checkbox.click();
			//	Thread.sleep(2000);
			//	checkbox.click();    
			}   
			
		//to print text from WebElement
		 WebElement job_name = driver.findElement(By.xpath("//label[@for='empsearch_job_title']"));
			String text = job_name.getText();
			System.out.println("Text is :"+text); 
			
		//to print text from DropDown values
		//we took an eg. of job title DropDown to print
			List<WebElement> job_title_Drops = driver.findElements(By.xpath("//select[@id='empsearch_job_title']//option"));
			
			  for(WebElement job_title:job_title_Drops) {
				  
				  System.out.println("Job Name : "+job_title.getText());
				  
			  }
		  

	
	
	
	}
	
}
