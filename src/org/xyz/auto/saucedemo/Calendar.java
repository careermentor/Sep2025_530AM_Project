package org.xyz.auto.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Calendar 
{

	@Test(enabled=false)
	public void icon_based_calendar() throws Exception
	{
		
		WebDriver driver = new ChromeDriver();  //launch chrome browser
		
		driver.get("https://www.makemytrip.com/"); //pass the url
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("[data-cy='closeModal']")).click();
		
		
		
		driver.findElement(By.cssSelector("[data-cy='departureDate']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("[aria-label='Tue Nov 04 2025']")).click();
		
	}
	
	@Test
	public void textbased_calendar() throws Exception
	{
		
		WebDriver driver = new ChromeDriver();  //launch chrome browser
		
		driver.get("https://practice-automation.com/calendars/"); //pass the url
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[contains(@name,'selectorenteradate')]")).sendKeys("2000-10-22");
		
		
		driver.findElement(By.xpath("//button[text()='22']")).click();
		
		
		
	}
	
}
