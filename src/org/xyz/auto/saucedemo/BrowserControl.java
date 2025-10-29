package org.xyz.auto.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class BrowserControl 
{

	@Test
	public void validate_login_functionilty() throws Exception
	{
		
		WebDriver driver = new ChromeDriver();  //launch chrome browser
		
		driver.get("https://www.google.com/"); //pass the url
		
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.navigate().forward();
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		
		//driver.close();  //close one window/tab
		
		driver.quit(); //close all the window/tab
		
	}
	
}
