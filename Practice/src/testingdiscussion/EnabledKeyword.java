package testingdiscussion;

import org.testng.annotations.Test;

public class EnabledKeyword {

	@Test(priority=1, invocationCount=3, enabled = false)
	public void car() {
		
		System.out.println("car from TestCase");
	}
	
	
	@Test(priority=2)
	public void home() {
		
		System.out.println("home from TestCase");
	}
	
	
	@Test(priority=3)
	public void egg() {
		
		System.out.println("egg from TestCase");
	}
	
	@Test
	public void zoo() {
		
		System.out.println("zoo from TestCase");
	}
}
