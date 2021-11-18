package Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class NewListeners implements ITestListener {

	@Override
	public void onFinish(ITestContext result) {	
	}

	@Override
	public void onStart(ITestContext arg0) {	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {	
	}

	@Override
	public void onTestFailure(ITestResult result) {
	System.out.println("Test case is failed");
		Screenshot.failedTestCaseScreenshot(result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case is skipped");		
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case is started");
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("Test case is successfull");
		
	}

}
