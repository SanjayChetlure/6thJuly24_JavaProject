package MethodWithReturnType;

public class Sample1
{
	//void -> return type
	
	public static void main(String[] args)
	{		
		int num2 = add(10, 20);   //30
		System.out.println(num2);	
		
		
		System.out.println(add(5, 6));		
	}
	
	//method with int return type
	public static int add(int a, int b) 
	{
		int c=a+b;
		return c;  //30
	}	
}
