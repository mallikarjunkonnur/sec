package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintDropDownValues {

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
	
		//going to PIM
			WebElement pim= driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']"));
			 pim.click();
			 
			//to print text from DropDown values
				//1. we took an eg. of job title DropDown to print with help of findElements();
					List<WebElement> job_title_Drops = driver.findElements(By.xpath("//select[@id='empsearch_job_title']//option"));
					
					  for(WebElement job_title:job_title_Drops) {
						  
						  System.out.println("Job Name : "+job_title.getText());
						  
					  }
					  
		  System.out.println("********************************************");
					  
		//to print text from DropDown values
			//2. we took an eg. of job title DropDown to print with help of Select class;
					  
		  WebElement drop_text = driver.findElement(By.xpath("//*[@id='empsearch_job_title']"));
		  
		  Select sel =new Select(drop_text);
		  
		  List<WebElement> joblist = sel.getOptions();
		   int size = joblist.size();
		   for(int i=0; i<size;i++) {
			   String jb = joblist.get(i).getText();
			   
			   System.out.println("Job_List are : "+jb);
		   }
		   
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
}
}
