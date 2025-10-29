package org.wipro.auto.project_uo.basePkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.wipro.auto.project_uo.utilities.Readelementconfigdata;

public class InitiateBrower
{

	public WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() throws Exception
	{
		if(Readelementconfigdata.readconfig("Browsername").equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else if(Readelementconfigdata.readconfig("Browsername").equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		
		if(Readelementconfigdata.readconfig("Browsername").equalsIgnoreCase("Safari"))
		{
			driver = new SafariDriver();
		}
		
		
		driver.get(Readelementconfigdata.readconfig("ApplicationURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.quit();
	}
}
