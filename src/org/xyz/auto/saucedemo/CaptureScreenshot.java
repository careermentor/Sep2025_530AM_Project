package org.xyz.auto.saucedemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot
{

	public static void testresult(WebDriver driver, String name) throws Exception
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File f = ts.getScreenshotAs(OutputType.FILE);
		
		File fd = new File("./screenshot_octrel/" + name + ".png");
		
		FileUtils.copyFile(f, fd);
		
		//String loc = "Hyderabad";
		//System.out.println("I live in city: " + loc + " this city is known as Pearl city" );
		
	}
	
}
