package org.wipro.auto.project_uo.testcases;

import org.testng.annotations.Test;
import org.wipro.auto.project_uo.basePkg.InitiateBrower;
import org.wipro.auto.project_uo.pages.LoginPage;
import org.wipro.auto.project_uo.pages.LoginPage_PF;

public class LoginScenario extends InitiateBrower
{

	@Test(enabled=false)
	public void tc01_validate_login_func_valid_credentials() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username("standard_user");
		login.enter_password("secret_sauce");
		login.click_loginbttn();
		
		//because "this.driver" is null
	}
	
	@Test
	public void tc02_validate_login_func_valid_credentials() throws Exception
	{
		LoginPage_PF login = new LoginPage_PF(driver);
		
		login.enter_username("standard_user");
		login.enter_password("secret_sauce");
		login.click_loginbttn();
		
		//because "this.driver" is null
	}
	
}
