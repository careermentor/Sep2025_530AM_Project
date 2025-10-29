package org.xyz.auto.saucedemo;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ListOFElements 
{


	@Test
	public void validate_login_functionilty() throws Exception
	{
		
		//WebDriver driver = new ChromeDriver();  //launch chrome browser
		
		WebDriver driver = new EdgeDriver();  //launch edge browser
		
		driver.get("https://www.saucedemo.com/"); //pass the url
		
		driver.manage().window().maximize();
		
		WebElement username_elementlocator = driver.findElement(By.id("user-name"));
		username_elementlocator.sendKeys("standard_user");
		
		//driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		
		WebElement landmark = driver.findElement(By.cssSelector("[class='error-message-container']"));
		
		driver.findElement(with(By.tagName("input")).above(landmark)).sendKeys("secret_sauce");
		
		//driver.findElement(By.className("submit-button btn_action")).click();
		
		boolean isloginbuttonenabled = driver.findElement(By.cssSelector("[value='Login']")).isEnabled();
		
		Assert.assertEquals(isloginbuttonenabled, true);
		
		driver.findElement(By.cssSelector("[value='Login']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.name("birthday_month")), "Oct"));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(""))));
		driver.findElement(By.xpath("")).click();
		
		/*
		boolean iserrormessagedisplayed = driver.findElement(By.cssSelector("[data-test='error']")).isDisplayed();
		
		Assert.assertEquals(iserrormessagedisplayed, true);
		
		Thread.sleep(5000);
		
		System.out.println(driver.findElement(By.cssSelector("[data-test='error']")).getText());
		
		/*
List<WebElement> listofproducts = driver.findElements(By.cssSelector("[class='inventory_item_name ']"));

for(WebElement link: listofproducts)
{
	System.out.println(link.getText());
}

		Thread.sleep(5000);
		//driver.close();
		*/
	}

	
}
