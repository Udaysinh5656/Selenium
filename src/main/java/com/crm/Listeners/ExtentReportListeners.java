package com.crm.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportListeners implements ITestListener {

	public static ExtentSparkReporter spark;
	public static ExtentReports report;
	public static ExtentTest test;
	
	
	@Override
	public void onTestStart(ITestResult result) {
		
		String name = result.getMethod().getMethodName();
		//create extentTest
		 test = report.createTest(name);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	
		test.log(Status.PASS, "pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		test.log(Status.FAIL, "fail");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		test.log(Status.SKIP, "skip");
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		//create ExtentSparkReporter
		spark = new ExtentSparkReporter("./src/main/resources/ExtentReports/CreateOrganization.html");
		//config spark
		spark.config().setDocumentTitle("Create Organization Report");
		spark.config().setReportName("Anish");
		spark.config().setTheme(Theme.DARK);
		//create extent reoport
		report = new ExtentReports();
		//config report
		report.setSystemInfo("OS", "Windows 11");
		report.setSystemInfo("Browser","Chrome 101");
		//attach spark to report
		report.attachReporter(spark);
	}

	@Override
	public void onFinish(ITestContext context) {
		
		report.flush();
	}

}