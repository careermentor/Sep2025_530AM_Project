package org.wipro.auto.project_uo.testcases;

import org.testng.annotations.Test;
import org.wipro.auto.project_uo.basePkg.InitiateBrower;
import org.wipro.auto.project_uo.datagenerator.TestDataGenerator;
import org.wipro.auto.project_uo.pages.SignupPage;

public class SignupScenario_DDF extends InitiateBrower
{

	@Test(dataProvider="signup", dataProviderClass=TestDataGenerator.class)
	public void tc01_validate_signup_func_valid_infomation(String firstname, String lastname, String dob_year, String username, String password) throws Exception
	{
		SignupPage signup = new SignupPage(driver);
		
		signup.click_createnewaccountbttn();
		signup.enter_firstname(firstname);
		signup.enter_lastname(lastname);
		signup.select_dob_day("18");
		signup.select_dob_month("Jul");
		signup.select_dob_year(dob_year);
		signup.click_gender_male();
		signup.enter_signup_username(username);
		signup.enter_signup_password(password);
		//signup.click_signupbttn();
		
	}
	
}
