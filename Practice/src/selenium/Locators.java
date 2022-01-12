package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\Selenium\\SeleniumApp\\selenium-java\\chromedriver_win32\\chromedriver.exe\\");
	
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.facebook.com/login/");
		
	//	driver.get("https://www.instagram.com/accounts/login/?hl=en");
		
		//driver.get("https://www.sololearn.com/users/login?returnUrl=%2Fprofile");
		
		
//		WebElement username = driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div/div[1]/div/form/div/div[1]/div/label/input"));
//		username.sendKeys("mallikarjun.konnur"); //insta
//		
//		WebElement password = driver.findElement(By.xpath("txtPa/html/body/div[1]/section/main/div/div/div[1]/div/form/div/div[2]/div/label/inputssword"));
//		
//		password.sendKeys("Hobbs@44"); //insta
		
		
		//WebElement loginbutton = driver.findElement(By.linkText("Log In"));// insta
	
		//orange----------------------------
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement username = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[2]/input"));// orange
		username.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.id("txtPassword"));
		
		password.sendKeys("admin123");
		
		WebElement login = driver.findElement(By.id("btnLogin"));
		
		login.click();	
		WebElement admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
		
		admin.click();
		
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Admin");
		
		Select userrole = new Select (driver.findElement(By.id("searchSystemUser_userType")));
		
		/* userrole.click(); */
		
		userrole.selectByVisibleText("Admin");
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		

		
	}
	
}
