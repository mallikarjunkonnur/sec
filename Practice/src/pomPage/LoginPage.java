package pomPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		wait = new WebDriverWait(driver, 20);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='userid']") 
	WebElement username;
	
	@FindBy(xpath="//*[@id='password']") 
	WebElement password;
	
	@FindBy(xpath="//*[@type='submit']") 
	WebElement login;
	
	@FindBy(xpath="//*[@id='pin']") 
	WebElement pin;
	
	
	public void loginWithValidInput() {
		
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='userid']")));
		username.sendKeys("DAA677");
		
		password.sendKeys("Velocity@123");
		
		login.click();	
		
	
	}
	
	public void enterPin() {
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

			pin.sendKeys("866918");
	        login.click();
	

	}

}
