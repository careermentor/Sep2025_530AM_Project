package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestScenario 
{

	@Test
	public void first_testcase()
	{
		System.out.println("first_testcase");
		
		//Assert.assertEquals("Hello", "Hello World"); //hard assertion
		
		
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals("Hello", "Hello World");
		
		
		System.out.println("this test case got failed");
		
		sa.assertAll();
		
	}
	
	@Test
	public void second_testcase()
	{
		System.out.println("second_testcase");
	}
	
	@Test
	public void third_testcase()
	{
		System.out.println("third_testcase");
		Assert.assertEquals("Hello World", "Hello World");
	}
	
	@Test
	public void forth_testcase()
	{
		System.out.println("forth_testcase");
	}
	
	@Test
	public void fifth_testcase()
	{
		System.out.println("fifth_testcase");
	}
	
	@Test
	public void sixth_testcase()
	{
		System.out.println("sixth_testcase");
	}
	
	@Test
	public void seventh_testcase()
	{
		System.out.println("seventh_testcase");
	}
}
