package Method;
public class Sample2
{
	//2: static regular method call from different/another class
	
	public static void main(String[] args)
	{
		System.out.println("Hi");
		
		Sample3.m3();       //diffClasName.methodName();
		Sample3.m4();
		Sample3.m4();
				
		System.out.println("Hello");
	}
}
