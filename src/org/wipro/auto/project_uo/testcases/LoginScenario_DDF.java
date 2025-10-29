package org.wipro.auto.project_uo.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.auto.project_uo.basePkg.InitiateBrower;
import org.wipro.auto.project_uo.datagenerator.TestDataGenerator;
import org.wipro.auto.project_uo.pages.LoginPage;
import org.wipro.auto.project_uo.pages.LoginPage_PF;

public class LoginScenario_DDF extends InitiateBrower
{

	@Test(dataProvider="login", dataProviderClass=TestDataGenerator.class)
	public void tc01_validate_login_func_valid_credentials(String username, String password) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username(username);
		login.enter_password(password);
		login.click_loginbttn();
		
	}
	
		
}
