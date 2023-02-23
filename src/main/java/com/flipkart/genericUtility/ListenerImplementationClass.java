package com.flipkart.genericUtility;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementationClass implements ITestListener
{
	
	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testcase=result.getMethod().getMethodName();
		EventFiringWebDriver sdriver=new EventFiringWebDriver(BaseClass.edriver);
			TakesScreenshot ts=(TakesScreenshot)sdriver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest=new File("./ScreenShot"+testcase+".png");
			try {
				FileUtils.copyFile(src, dest);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}


}
