package com.abc.UtilityClass1234;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass1234 extends ExtentReport {
	public static Properties prop1234;
	public static WebDriver driver1234;
	
	@BeforeSuite(alwaysRun = true)
	public void browserlaunch() {
		ReadProperty1234();
		if (prop1234.getProperty("Browsername").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "Resoursces\\chromedriver.exe");
			driver1234 = new ChromeDriver();
		}
		if (prop1234.getProperty("Browsername").equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "Resoursces\\geckodriver.exe");
			driver1234 = new FirefoxDriver();
		}
		
		
		
		driver1234.get(prop1234.getProperty("url"));
		driver1234.manage().window().maximize();
		
		
				
	}

	@AfterSuite(alwaysRun = true)
	public void locked() {
		driver1234.close();
	}

	public void ReadProperty1234() {
		prop1234 = new Properties();
		try {
			prop1234.load(new FileInputStream("Resoursces\\Read.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
