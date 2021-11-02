package utility;

import java.io.IOException;

//import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import reusableComponents.WebDriverHelper;

//import reusableComponents.WebDriverHelper;

//import org.testng.ITestListener;

public class Listeners implements ITestListener {
	//WebDriver driver;
WebDriverHelper b=new WebDriverHelper();
Screenshot s=new Screenshot();
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//ScreenShot
		//result.getName();
		try
		{
		s.getss(result.getName());
		}
		catch (IOException e)
		{
		e.printStackTrace();
		}
		
		
	}
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
	
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	
}
