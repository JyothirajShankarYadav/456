package com.shoppersstack.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.shopperstack.generic.Generics;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.TestResult;
@Listeners(TestListeners.class)
public class baseClass 
{
	public WebDriver driver;
	public ExtentReports report;
	public ExtentTest test;
 @BeforeSuite
 public void creationOfReport()
 {
	 ExtentSparkReporter spark=new ExtentSparkReporter("./Extentreport/report.html");
	 report=new ExtentReports();
	 report.attachReporter(spark);
	 spark.config().setTheme(Theme.STANDARD);
	 spark.config().setReportName("Automation Test Report");
 }
 @BeforeClass
 public void launchBrowser(/*ITestResult result*/) throws Exception
 {
	 WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 driver.get("https://www.shoppersstack.com/user-signin");
	 Thread.sleep(3000);
	 test=report.createTest("Shoppersstack "/*+result.getMethod().getDescription()*/);
 }
 @AfterClass
 public void aftertestcase(ITestResult result) throws Exception
 {
	 if(result.getStatus()==ITestResult.FAILURE)
	 {
		 test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" -failed", ExtentColor.RED));
		 test.addScreenCaptureFromPath(Generics.getPhoto(driver));
	 }
	 else if(result.getStatus()==ITestResult.SKIP)
	 {
		 test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" -skipped", ExtentColor.GREY));
	 }
	 else if(result.getStatus()==ITestResult.SUCCESS)
	 {
		 test.log(Status.PASS,MarkupHelper.createLabel(result.getName()+" -passed", ExtentColor.GREEN));
	 }
 }
 
 @AfterSuite
 public void reportFlush()
 {
	 driver.close();
	 report.flush();
 }
 
}
