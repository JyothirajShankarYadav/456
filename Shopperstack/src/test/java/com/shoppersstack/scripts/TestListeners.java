package com.shoppersstack.scripts;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener
{
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Testcase Pass");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Testcase Failed");
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Testcase Skipped");
	}
}
