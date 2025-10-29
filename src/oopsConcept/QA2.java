package oopsConcept;

public class QA2 extends QA1
{

	final int x  = 50;
	
	public void printVar()
	{
		//final int x  =100;
		//x=200;
		System.out.println(x); //100
		
		System.out.println(this.x);  //50
		
		System.out.println(super.x); //500
		
		super.sum(20, 30);
	}
	
	public void sum(int a, int b)
	{
		int c=a*a+b*b;
		
		System.out.println("sq sum of a&b: " + c);
		
	}
	
	public void sub(int a, int b)
	{
		int c=a-b;
		
		System.out.println("sub of a&b: " + c);
		
	}
	
	public static void main(String[] args) {
		
		QA2 q2 = new QA2();
		//q2.sum(20, 30);
		//q2.sub(20, 30);
		//q2.qa1im();
		
		q2.sum(20, 30);
		
		q2.printVar();
	}

	/*
	public void qa1im() {
		System.out.println("this is method of QA1I");
		
	}
	*/
}
