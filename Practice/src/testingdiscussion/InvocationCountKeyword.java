package testingdiscussion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InvocationCountKeyword {
	
	@BeforeTest
	public void car() {
		
		System.out.println("car from TestCase");
	}
	
	@Test(priority=2)
	public void home() {
		
		System.out.println("home from TestCase");
	}
	
	@AfterTest
	public void egg() {
		
		System.out.println("egg from TestCase");
	}
//	
//	@Test
//	public void zoo() {
//		
//		System.out.println("zoo from TestCase");
	}
