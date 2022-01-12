package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MethodsToCheckStatus {

	
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
		 
		 //checking WebElement is Enabled or not to perform operation
		 WebElement checkbox= driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectAll']"));
		 boolean isoperable = checkbox.isEnabled();
		 
	//	 boolean isoperable = driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectAll']")).isEnabled(); // both are same
		 System.out.println("checkbox is operable "+isoperable);
		 
		 //checking WebElement is Selected or not. 
		boolean isselected = checkbox.isSelected();
		System.out.println("checkbox is selected "+isselected);
		
		checkbox.click();
		
		boolean afterselected = checkbox.isSelected();
		System.out.println("After selecting checkbox is selected "+afterselected);
		
		//checking WebElement is Displayed over web page or not.
		 
		 WebElement del = driver.findElement(By.xpath("//*[@id='btnDelete']"));
		 boolean isdisplayed = del.isDisplayed();
		 System.out.println("delete is displayed "+isdisplayed);
		 
		//checking textbox WebElement is Enabled or not to perform operation
		 WebElement textbox = driver.findElement(By.xpath("//*[@id='empsearch_employee_name_empName']"));
		 boolean istextbox = textbox.isEnabled();
		 System.out.println("TextBox is operable "+istextbox);
		 
		 
}
}
