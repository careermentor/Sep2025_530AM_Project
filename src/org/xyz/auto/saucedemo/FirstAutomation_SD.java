package org.xyz.auto.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

public class FirstAutomation_SD 
{

	@Test
	public void validate_login_functionilty() throws Exception
	{
		
		//WebDriver driver = new ChromeDriver();  //launch chrome browser
		
		WebDriver driver = new EdgeDriver();  //launch edge browser
		
		driver.get("https://www.saucedemo.com/"); //pass the url
		
		driver.manage().window().maximize();
		
		WebElement username_elementlocator = driver.findElement(By.id("user-name"));  //failed with error
		//no such element: Unable to locate element:
		username_elementlocator.sendKeys("standard_user");
		
		//driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		
		WebElement landmark = driver.findElement(By.cssSelector("[class='error-message-container']"));
		
		driver.findElement(with(By.tagName("input")).above(landmark)).sendKeys("secret_sauce");
		
		//driver.findElement(By.className("submit-button btn_action")).click();
		driver.findElement(By.cssSelector("[value='Login']")).click();
		
		List<WebElement> listofproducts = driver.findElements(By.cssSelector("[class='inventory_item_name']"));
		if(listofproducts.size()>0)
				{
				listofproducts.get(0).click();
				}
		else
		{
			System.out.println("elements are not available");
		}
		
		//listofproducts.get(1).click();
		
		//driver.findElements(By.cssSelector("[class='inventory_item_name ']")).get(0).click();
		//driver.findElements(By.cssSelector("[class='inventory_item_name ']")).get(1).click();

		//Thread.sleep(5000);
		//driver.close();
		
	}
	
}
