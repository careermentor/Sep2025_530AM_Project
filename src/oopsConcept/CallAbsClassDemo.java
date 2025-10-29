package oopsConcept;

public class CallAbsClassDemo extends AbsClassDemo
{

	public static void main(String[] args)
	{
		CallAbsClassDemo ccd = new CallAbsClassDemo();
		ccd.meth1();
		ccd.meth2();
		
		
	}

	
	public void meth2() 
	{
		System.out.println("this is abstract which is implemneted");
		
	}
	
}
