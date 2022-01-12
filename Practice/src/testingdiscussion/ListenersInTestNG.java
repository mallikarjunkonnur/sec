package testingdiscussion;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Utility.Screenshot;

public class ListenersInTestNG extends PracticeSoftAssert implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
	
		System.out.println("Test case: "+ result.getName());
		
		try {
			Screenshot.captureScreenshot(driver, result.getName());
		} 
		catch(IOException e){
			System.out.println(e.getMessage());
			
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	
		System.out.println("Test Case Skipped :"+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
