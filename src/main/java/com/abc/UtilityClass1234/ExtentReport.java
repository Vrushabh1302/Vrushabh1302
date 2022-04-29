package com.abc.UtilityClass1234;

import java.io.File;
import java.util.Date;

import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {

	public static ExtentSparkReporter spark1234;
	public static ExtentReports report1234;
	public static ExtentTest test1234;
	public static String filepath;

	@BeforeTest
	public void Extentreport() {
		Date now = new Date();
		String timestamp = now.toString().replace(":", "-");
		File folder = new File("result/" + timestamp);
		folder.mkdir();
		filepath = folder.getPath();
		spark1234 = new ExtentSparkReporter(filepath+ "/result.html");
		report1234 = new ExtentReports();
		report1234.attachReporter(spark1234);
		spark1234.config().setTheme(Theme.DARK);
		spark1234.config().setDocumentTitle("Mven Result");
		spark1234.config().setReportName("YesBank");

	}

	public void testcasepass(String Pass) {
		// test1234.log(Status.PASS, Pass +ScreenShot.GetScreenshot());
		test1234.log(Status.PASS, Pass);
		test1234.addScreenCaptureFromPath(ScreenShot.GetScreenshot());
	}

	public void testcasefail(String Fail) {
		test1234.log(Status.FAIL, Fail);

		// test1234.addScreenCaptureFromPath(ScreenShot.GetScreenshot());
	}

	public void steps(String Steps) {
		test1234.log(Status.INFO, Steps);
	}

	public void Createtest(String description) {
		test1234 = report1234.createTest(description);
	}

}
