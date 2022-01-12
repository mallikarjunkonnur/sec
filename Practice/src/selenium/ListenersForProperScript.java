package selenium;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Parameters;

import Utility.ReadAndWriteInExcel;
import Utility.Screenshot;

public class ListenersForProperScript extends ProperScript implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {

		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	
		System.out.println("Test Case :"+ result.getName());
		
		try {
			ReadAndWriteInExcel.writeInExcel(1,2, "Pass");
		} catch (IOException e) {
			
		}
	}

	
	@Override
	public void onTestFailure(ITestResult result) {
		
	System.out.println("Test Case :"+ result.getName());
		
		try {
			ReadAndWriteInExcel.writeInExcel(2,2, "Fail");
		} catch (IOException e) {
			
		}
		
		try {
			Screenshot.captureScreenshot(driver, result.getName());
		} 
		catch(IOException e){
			System.out.println(e.getMessage());
			
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
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
