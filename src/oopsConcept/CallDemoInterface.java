package oopsConcept;

public class CallDemoInterface implements DemoInterface
{

	
	public static void main(String[] args) {
		
		CallDemoInterface cd = new CallDemoInterface();
		cd.meth3();
		cd.meth4();
		
		System.out.println(cd.a);
		
	}

	
	public  void meth3() {
	
		System.out.println("method3");
		System.out.println(a);
		
		
		
	}

	
	public void meth4() {
		System.out.println("method4");
		
	}
}
