package com.naveenAutomation.utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.naveenAutomation.base.TestBase;

public class CustomListener extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		logger.info("***************Test Case started"+ result.getMethod().getMethodName()+"*****************");

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("***************Test Case Passed"+ result.getMethod().getMethodName()+"*****************");


	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("!!!!!!!!!!!!!!!Test Case fail"+ result.getMethod().getMethodName()+ " Taking Screenshot!!!!!!!!!!!!!!!!!!!");
		TestBase.failedTestScreenShot(result.getMethod().getMethodName());


	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("????????????Test Case skipped"+ result.getMethod().getMethodName()+"????????????");


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
