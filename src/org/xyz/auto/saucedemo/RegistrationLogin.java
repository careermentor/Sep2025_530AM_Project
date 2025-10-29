package org.xyz.auto.saucedemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationLogin 
{
	
	
	WebDriver driver;

	@BeforeMethod
	public void initiatebrowser()
	{
		
		driver= new EdgeDriver();  //launch edge browser
		
		String expURL = "https://www.facebook.com/";
		
		driver.get(expURL); //pass the url
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String actURL = driver.getCurrentUrl();  //fetch URL from the browser
		Assert.assertEquals(actURL, expURL);
		
		driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void closebrowser() throws Exception
	{
		Thread.sleep(5000);
		//driver.close();
		
		
	}
	

	@Test(enabled=false)
	public void validate_signup_functionilty()
	{
		
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("John");
		
		driver.findElement(By.name("firstname")).clear();
		
		driver.findElement(By.name("firstname")).sendKeys("David");
		
		Select dob_day = new Select(driver.findElement(By.name("birthday_day")));
		
		//dob_day.selectByIndex(4); //5
		//dob_day.selectByValue("5");//5
		dob_day.selectByVisibleText("5"); //5
		
		Select dob_month = new Select(driver.findElement(By.name("birthday_month")));
		dob_month.selectByVisibleText("Dec");
		//dob_month.selectByVisibleText("Oct");
		//dob_month.selectByVisibleText("Nov");
		
		//dob_month.deselectAll();
		
		
		
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		//driver.findElement(By.name("websubmit")).click();
	
		
		
	}
	
	@Test
	public void validate_login_functionilty()
	{
		String expLoginPageTitle = "Facebook – log in or sign up";
		
		String actLoginPageTitle = driver.getTitle();
		
		Assert.assertEquals(actLoginPageTitle, expLoginPageTitle);
		
		WebElement username_elementlocator = driver.findElement(By.id("email"));
		
		String expUsernameTextbox = "Email address or phone number";
		String actUsernameTextbox = username_elementlocator.getAttribute("placeholder");
		
		Assert.assertEquals(actUsernameTextbox, expUsernameTextbox);
		
		username_elementlocator.sendKeys("standard_user");
		
		driver.findElement(By.name("pass")).sendKeys("secret_sauce");
		
		String expLoginButton = "Log in";
		String actLoginButton = driver.findElement(By.cssSelector("[type='submit']")).getText();
		
		Assert.assertEquals(actLoginButton, expLoginButton, "Login button is not matching");
		
		System.out.println(driver.findElement(By.cssSelector("[type='submit']")).getLocation());
		
		//System.out.println(driver.getPageSource());
		
		//driver.findElement(By.cssSelector("[type='submit']")).click();
		
				
	}
	
}
