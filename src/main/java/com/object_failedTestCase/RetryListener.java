package com.object_failedTestCase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListener implements IRetryAnalyzer {

	
	int failedCount =0;
	int limit =5;
	
	
	@Override
	public boolean retry(ITestResult arg0) {
		if(failedCount<limit){
			failedCount++;
			return true;
		}
		return false;
	}
}
