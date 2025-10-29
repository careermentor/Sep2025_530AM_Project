package oopsConcept;

public class DemoStaticKeyword
{

	static int x = 100;
	
	public static void printValX()
	{
		
		System.out.println(x);
	}
	
	public void meth2()
	{
		System.out.println("this is non static method");
	}
	
	public static void main(String[] args) 
	{
	
		printValX();
		
		DemoStaticKeyword dsk = new DemoStaticKeyword();
		dsk.meth2();
		
	}
	
}
