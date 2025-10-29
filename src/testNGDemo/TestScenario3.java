package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario3 
{

	@Test(groups="Smoke")
	public void first_testcase()
	{
		System.out.println("first_testcase");
	}
	
	@Test(groups="Regression")
	public void second_testcase()
	{
		System.out.println("second_testcase");
	}
	
	@Test
	public void third_testcase()
	{
		System.out.println("third_testcase");
		
		Assert.assertEquals(false, true);
	}
	
	@Test(dependsOnMethods="third_testcase")
	public void forth_testcase()
	{
		System.out.println("forth_testcase");
	}
	
	@Test(groups="Sanity")
	public void fifth_testcase()
	{
		System.out.println("fifth_testcase");
	}
	
	@Test(groups={"Regression","Sanity"})
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
