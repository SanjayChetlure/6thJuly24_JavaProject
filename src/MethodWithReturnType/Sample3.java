package MethodWithReturnType;

public class Sample3
{
	public static void main(String[] args)
	{	
		Sample3 s3=new Sample3();
		
		int num1=5;
		
		int num2 = s3.add(10, 20);  
		
		int num3 = s3.mult(num1, num2);   // 5, 30
		System.out.println(num3);
	}
	
	//method with int return type
	public int add(int a, int b) 
	{
		int c=a+b;
		return c;  //30
	}
	
	public int mult(int c, int d) 
	{
		int e=c*d;
		return e;
	}	
}
