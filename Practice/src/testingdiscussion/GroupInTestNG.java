package testingdiscussion;

import org.testng.annotations.Test;

import org.testng.Assert;



public class GroupInTestNG {
	
	@Test(groups = "Sanity", priority = 1)
	public void login()
	{
		System.out.println("Login test case");
		
	}
	
	@Test(groups = "Regression", priority = 2)
	public void dashBoardTest()
	{
		System.out.println("Dashboard Test");
		
	}
	
	@Test(groups = "Regression", priority = 3)
	public void checkBox()
	{
		System.out.println("checkbox test");
		
	Assert.fail();
	}
	
	
	@Test(groups = "Sanity", priority = 4, dependsOnMethods ="checkBox")
	public void logoff()
	{
		System.out.println("Logoff from application");
	}
	
	@Test(groups = "Sanity", priority = 5)
	public void home()
	{
		System.out.println("home test case");
	}
	
	@Test(groups = "functional", priority = 6)
	public void profile()
	{
		System.out.println("profile accessibility test case");

	
	}
}
