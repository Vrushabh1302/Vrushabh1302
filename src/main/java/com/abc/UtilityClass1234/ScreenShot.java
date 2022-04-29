package com.abc.UtilityClass1234;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenShot extends BaseClass1234 {

	public static String GetScreenshot() {

		TakesScreenshot screenshot = (TakesScreenshot) driver1234;
		String Date = new SimpleDateFormat("YYMMDDHHMMSS").format(new java.util.Date());
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		String Destination = filepath + "/" + Date + ".png";
		File folder1 = new File(Destination);
		try {
			FileUtils.copyFile(file, folder1);
		} catch (IOException e) {  

		
			
		}
		return Date + ".png";
	}

}
