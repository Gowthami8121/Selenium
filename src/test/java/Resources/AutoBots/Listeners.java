package Resources.AutoBots;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;



import Utlilities.Autobots.Extentreportcheck;

public class Listeners extends BaseClass implements ITestListener {
	ExtentTest test;
	ExtentReports extent = Extentreportcheck.getreports();
	
	@Override
	public void onTestStart(ITestResult res)
	{
	test =extent.createTest(res.getMethod().getMethodName());
	
	}
	@Override
	public void onStart(ITestContext res)
	{
	}
	@Override
	public void onFinish(ITestContext res){
		extent.flush();
	
	}
	// Run when the test case passed successfully
	@Override
	public void onTestSuccess(ITestResult res)
	{
	test.log(Status.PASS, "this test case is passed");
	}
	// Run when the test case fails
	@Override
	public void onTestFailure(ITestResult res)
	{
	test.log(Status.FAIL, "This test fail");
	try {
		driver=(WebDriver)res.getTestClass().getRealClass().getField("driver").get(res.getInstance());
	} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//String filepath;
	try {
		String filepath = getScreenshot(res.getMethod().getMethodName(), driver);
		test.addScreenCaptureFromPath(filepath,res.getMethod().getMethodName());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	// Run when test case pass with some failures
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult res)
	{
	
	}
	// Run when the test case is skipped
	@Override
	public void onTestSkipped(ITestResult res)
	{
	
	}

}
