package testingdiscussion;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterLog {
	
	@Test(priority=1 , invocationCount = 2,enabled = true)
	public void car() {
		
	//	System.out.println("car");
		
		Reporter.log("car Test case"); // by default false
	}
	
	@Test(priority=2)
	public void bike() {
		
	//	System.out.println("bike");
		
		Reporter.log("bike Test case", false);
	}

	@Test(priority=0)
	public void scooty() {
		
		//System.out.println("scooty");
		Reporter.log("scooty Test case", true);
	}
	
	
}
