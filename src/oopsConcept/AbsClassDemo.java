package oopsConcept;

public abstract class AbsClassDemo 
{

	int a  =20;
	
	
	public AbsClassDemo()
	{
		a=30;
		System.out.println("this is constructor");
		System.out.println(a);
	}
	
	public void meth1()
	{
		System.out.println("this is concrete method");
		System.out.println(a);
	}
	
	public abstract void meth2();
	
	
	/*
	public static void main(String[] args)
	{
	
		AbsClassDemo ac = new AbsClassDemo();
		ac.meth1();
		ac.meth2();
		
	}
	
	*/
	
}
