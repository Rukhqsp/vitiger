
	package com.vtiger.genericlib;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Protocol;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listner implements ITestListener{
	ExtentSparkReporter esr;
	ExtentTest test;
	ExtentReports er;
	
	
	

	@Override
	public void onTestStart(ITestResult result) {
		String methname=result.getName();
		Reporter.log(methname+"Testcase Started",true);
		test=er.createTest(methname);
	}


	@Override
	public void onTestSuccess(ITestResult result) {
		String methname=result.getName();
		Reporter.log(methname+"Testcase executed",true);
		test.log(Status.PASS,"Testcase executed"+methname);
	}


	@Override
	public void onTestFailure(ITestResult result) {
		String methname=result.getName();
		Reporter.log(methname+"Testcase failed",true);
		test.log(Status.SKIP,"Testcase failed"+methname);
	}


	@Override
	public void onTestSkipped(ITestResult result) {
		String methname=result.getName();
		Reporter.log(methname+"Testcase skipped",true);
		test.log(Status.SKIP,"Testcase skipped"+methname);
	}


	@Override
	public void onStart(ITestContext context) {
		esr=new ExtentSparkReporter(Iconstant.Reportpath);
		esr.config().setDocumentTitle("Vtiger Regression testing");
		esr.config().setReportName("Rukhsar");
		esr.config().setProtocol(Protocol.HTTPS);
		esr.config().setTheme(Theme.DARK);
		
		er=new ExtentReports();
		er.attachReporter(esr);
		er.setSystemInfo("OS","Windows");
		er.setSystemInfo("version","11");
		er.setSystemInfo("Bites","64");
		er.setSystemInfo("Graphics","i5");
		
		String methname=context.getName();
		Reporter.log(methname+"Project Started",true);
		
	}


	@Override
	public void onFinish(ITestContext context) {
		String methname=context.getName();
		Reporter.log(methname+"Project Finished",true);
		er.flush();
	}
}    