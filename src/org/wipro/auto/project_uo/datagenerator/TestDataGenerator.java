package org.wipro.auto.project_uo.datagenerator;

import org.testng.annotations.DataProvider;

public class TestDataGenerator
{

	@DataProvider(name="login")
	public Object[][] login_testdata()
	{
		Object[][] data3 = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};
		
		return data3;
		
	}

	@DataProvider(name="signup")
	public Object[][] signup_testdata()
	{
		Object[][] data3 = {{"John","Lee", "2000", "user1", "Pass1"},{"John01","Lee02", "2024", "user2", "Pass2"},{"John@1","Lee@07", "2022", "user3", "Pass3"}};
		
		return data3;
		
	}
	
}
