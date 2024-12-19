package Method;

public class Sample1 
{
	//1: static regular method call from same class  
	
	//main method 		  (main -> method name)
	public static void main(String[] args)   //pre- defined method
	{		
		System.out.println("Hi");
		 
		m1();   //methodname();     //method calling
		m2();
		m2();
		m2();
	
		System.out.println("Hello");		
	}
	
	
	//static regular method 
	public static void m1()  //user defined   //regular method declaration
	{
		System.out.println("running static regular method m1");
	}
	
	public static void m2()
	{
		System.out.println("running static regular method m2");
	}
	
}
