package testingdiscussion;

import org.testng.annotations.Test;

public class PriorityOfTestCase {

	@Test(priority=1)
	public void van() {
		
		System.out.println("van from TestCase");
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
