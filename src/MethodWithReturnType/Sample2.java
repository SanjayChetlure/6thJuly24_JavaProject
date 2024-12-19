package MethodWithReturnType;

public class Sample2
{
	public static void main(String[] args)
	{	
		int num1=5;
		
		int num2 = add(10, 20);  
		
		int num3 = mult(num1, num2);   // 5, 30
		System.out.println(num3);
	}
	
	//method with int return type
	public static int add(int a, int b) 
	{
		int c=a+b;
		return c;  //30
	}
	
	public static int mult(int c, int d) 
	{
		int e=c*d;
		return e;
	}
	
}
