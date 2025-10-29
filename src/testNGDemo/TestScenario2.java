package testNGDemo;

import org.testng.annotations.Test;

public class TestScenario2 
{

	@Test(priority=1)
	public void first_testcase()
	{
		System.out.println("first_testcase");
	}
	
	@Test(priority=2)
	public void second_testcase()
	{
		System.out.println("second_testcase");
	}
	
	@Test
	public void third_testcase()
	{
		System.out.println("third_testcase");
	}
	
	@Test(priority=0)
	public void forth_testcase()
	{
		System.out.println("forth_testcase");
	}
	
	@Test(priority=-1)
	public void fifth_testcase()
	{
		System.out.println("fifth_testcase");
	}
	
	@Test(priority=-2)
	public void sixth_testcase()
	{
		System.out.println("sixth_testcase");
	}
	
	@Test(priority=3)
	public void seventh_testcase()
	{
		System.out.println("seventh_testcase");
	}
}
