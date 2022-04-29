package com.abc.testcasespages1234;

import java.io.File;
import java.util.Date;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.abc.Pages1234.LoginPage1234;
import com.aventstack.extentreports.Status;

public class Loginpagetestcases1234 extends LoginPage1234 {
	@Test(priority = 1)
	public void Invalidcred() {

		Createtest("user unable to login with invalid credentials");
		test1234.assignAuthor("chetan").assignCategory("regression");
		
		steps("Enter invalid username");
		steps("Enter valid password");
		steps("Click on login button");
		LoginPage1234 log = new LoginPage1234();
		log.login1234(prop1234.getProperty("invalidusername"), prop1234.getProperty("Password"));
		if (driver1234.findElement(By.id("spanMessage")).isDisplayed()) {
			testcasepass("user unable to login with invalid credentials");
		} else {
			testcasefail("user able to login with invalid credentials");
		}
		report1234.flush();
	}

	@Test(priority = 2)
	public void Validcred() {
		test1234 = report1234.createTest("user unable to login with valid credentials").assignAuthor("megha")
				.assignCategory("smoke");
		steps("Enter invalid username");
		steps("Enter valid password");
		steps("Click on logi button");
		LoginPage1234 log = new LoginPage1234();
		log.login1234(prop1234.getProperty("Username"), prop1234.getProperty("Password"));
		if (driver1234.findElements(By.xpath("//b[text()='Dashboard']")).size() > 0) {
			// if(driver1234.findElement(By.xpath("//b[text()='Dashboard']")).isDisplayed())
			// {
			testcasepass( "user able to login with valid credentials");
		} else {
			testcasefail( "user unable to login with valid credentials");

		}
		report1234.flush();

	}
}
