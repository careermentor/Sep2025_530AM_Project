package org.wipro.auto.project_uo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.wipro.auto.project_uo.utilities.Readelementconfigdata;

public class LoginPage_PF 
{

	WebDriver driver;
	
	public LoginPage_PF(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user-name")
	WebElement textbox_username;
	
	@FindBy(name="password")
	WebElement textbox_password;
	
	@FindBy(css="[type='submit']")
	WebElement loginbuttn;

	public void enter_username(String uname) throws Exception
	{
		//WebElement textbox_username = driver.findElement(By.id(Readelementconfigdata.readelement("login_username_id")));
		textbox_username.sendKeys(uname);
	}
	
	public void enter_password(String pass) throws Exception
	{
		textbox_password.sendKeys(pass);
	}
	
	public void click_loginbttn() throws Exception
	{
		loginbuttn.click();
	}
}
