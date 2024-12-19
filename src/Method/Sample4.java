package Method;

public class Sample4 
{
	//3: non-static regular method call from same class
	
	public static void main(String[] args) 
	{
		System.out.println("Hi");
		
		//step1: create object/instance/copy of class
		//step2: method call -> objectName.methodName();
		
		//  className objectName =new className();
		Sample4 s4=new Sample4();
		s4.m5();
		s4.m6();
		s4.m6();
		
		//1: Sample4  -> className  -> as a dataType of object
		//2: s4  -> objectName  -> to refer/identify object
		//3: new  -> keyword  -> use to create blank/empty object
		//4: Sample4() -> className() -> Constructor -> use to copy/load all the members of class into object
		
		System.out.println("Hello");
	}
	
	//non-static regular method
	public void m5() 
	{
		System.out.println("running non-static regular method m5 from same class");
	}
	
	//non-static regular method
	public void m6() 
	{
		System.out.println("running non-static regular method m6 from same class");
	}
}
