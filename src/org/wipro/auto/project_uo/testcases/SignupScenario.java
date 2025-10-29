package org.wipro.auto.project_uo.testcases;

import org.testng.annotations.Test;
import org.wipro.auto.project_uo.basePkg.InitiateBrower;
import org.wipro.auto.project_uo.pages.SignupPage;

public class SignupScenario extends InitiateBrower
{

	@Test
	public void tc01_validate_signup_func_valid_infomation() throws Exception
	{
		SignupPage signup = new SignupPage(driver);
		
		signup.click_createnewaccountbttn();
		signup.enter_firstname("John");
		signup.enter_lastname("Lee");
		signup.select_dob_day("18");
		signup.select_dob_month("Jul");
		signup.select_dob_year("2000");
		signup.click_gender_male();
		signup.enter_signup_username("johnlee@gmail.com");
		signup.enter_signup_password("John@12345");
		//signup.click_signupbttn();
		
	}
	
}
