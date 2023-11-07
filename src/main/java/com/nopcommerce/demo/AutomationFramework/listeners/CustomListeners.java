package com.nopcommerce.demo.AutomationFramework.listeners;

import com.nopcommerce.demo.AutomationFramework.utils.Utils;
import com.nopcommerce.demo.AutomationFrameworkForNopcommerce.base.TestBase;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners extends TestBase implements ITestListener{
	@Override
	public void onTestStart(ITestResult result) {
		logger.info("Test execution started for"+result.getMethod().getMethodName());
	}

	  public void onTestSuccess(ITestResult result) {
		  logger.info("Test"+result.getMethod().getMethodName()+"Passed");
		  
	  }

	  @Override
	  public void onTestFailure(ITestResult result) {
		  Utils.takeScreenShot (result.getMethod().getMethodName());  
	  }

	  @Override
	  public void onTestSkipped(ITestResult result) {
		  
	  }

	
	  @Override
	  public void onStart(ITestContext context) {
		  
	  }

	  @Override
	  public void onFinish(ITestContext context) {
		  
	  }


}
