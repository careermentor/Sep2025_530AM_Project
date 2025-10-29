package org.xyz.auto.saucedemo;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeyboardMouseWindows 
{
	
	
	WebDriver driver;

	@Test(enabled=true)
	public void handleFrames() throws Exception
	{
		
		driver= new EdgeDriver();  //launch edge browser
		
		driver.get("https://demoqa.com/frames");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.findElement(By.xpath("//h1[text()='Frames']")).getText());
		
		driver.switchTo().frame("frame1");
		
		System.out.println(driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText());
		
		CaptureScreenshot.testresult(driver,"handleFrames");
		
	}
	
	
	@Test(enabled=true)
	public void handleAlerts() throws Exception
	{
		
		driver= new EdgeDriver();  //launch edge browser
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.className("signin-btn")).click();
		
		Thread.sleep(5000);
		
		//CaptureScreenshot.testresult(driver,"handleAlerts_1");
		
		driver.switchTo().alert().accept();
		
		//Thread.sleep(5000);
		
		CaptureScreenshot.testresult(driver,"handleAlerts_2");
	}
	
	
	@Test(enabled=false)
	public void dragdrop() throws Exception
	{
		
		driver= new EdgeDriver();  //launch edge browser
		
		driver.get("https://demoqa.com/droppable");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement src = driver.findElement(By.xpath("//div[text()='Drag me']"));
		WebElement tgt = driver.findElement(By.xpath("(//p[text()='Drop here'])[1]"));
		
		act.dragAndDrop(src, tgt).perform();
		
	}
	
	
	@Test(enabled=false)
	public void handleMouse() throws Exception
	{
		
		driver= new EdgeDriver();  //launch edge browser
		
		driver.get("https://www.mphasis.com/home.html");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		//act.click(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		//act.doubleClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		
		//act.contextClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
	
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Industries']"))).perform();
		
		//act.click(driver.findElement(By.xpath("//span[text()=' HealthCare ']"))).perform();
		
		act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//span[text()=' HealthCare ']"))).keyUp(Keys.CONTROL).perform();
		
		Set<String> windowsid = driver.getWindowHandles();
		
		System.out.println(windowsid);
		
		Iterator<String> itr = windowsid.iterator();
		
		String win1 = itr.next();
		String win2 = itr.next();
		
		driver.switchTo().window(win2);
		//driver.switchTo().window(win1);
	}
	
	@Test(enabled=false)
	public void handleKeyboards() throws Exception
	{
		
		driver= new EdgeDriver();  //launch edge browser
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		act.sendKeys("user1").perform();
		
		Thread.sleep(5000);
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		
		//act.sendKeys(Keys.TAB).perform();
		//act.sendKeys("pass122344").perform();
		//act.sendKeys(Keys.ENTER).perform();	
		
		
	}
	
}
