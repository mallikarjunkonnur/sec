package testingdiscussion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PracticeSoftAssert2 {
	
	@Test(dependsOnMethods = "testingdiscussion.PracticeSoftAssert.testCase1")
	public void testCase3()
	{
	Reporter.log("First line", true);
	
	SoftAssert sa = new SoftAssert();
	
	sa.assertEquals(true, true);
	
	Reporter.log("second line", true);
	
	sa.assertAll();
	
	
	}
	
	@Test
	
	public void testCase2()
	{
	Reporter.log("First line", true);
	
	SoftAssert sa = new SoftAssert();
	
	sa.assertTrue(true, "Test case failed");
	
	Reporter.log("second line", true);
	
	sa.assertEquals("abc", "abc");
	
	Reporter.log("Third line", true);
		
	sa.assertAll();
	}


}
