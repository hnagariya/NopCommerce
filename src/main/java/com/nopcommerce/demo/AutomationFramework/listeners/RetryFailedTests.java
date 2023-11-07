package com.nopcommerce.demo.AutomationFramework.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.nopcommerce.demo.AutomationFrameworkForNopcommerce.base.TestBase;

public class RetryFailedTests extends TestBase implements IRetryAnalyzer{
     
	// logic to run the failed tests
	int count=1;
	int maxCount=2;
	
	@Override
	public boolean retry(ITestResult result) {
		if(count<maxCount) {
			return true;
		}
		return false;
	}

}
