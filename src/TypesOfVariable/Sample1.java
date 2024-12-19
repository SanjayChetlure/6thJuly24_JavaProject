package TypesOfVariable;

public class Sample1 
{
	int num5=50;       //global variable
	
	public void m1()
	{
		int num1=10;             //local variable
		System.out.println(num1);	 //10	
		System.out.println(num5);     //50
	}
	
	public void m2()
	{
		int num2=20;                 //local variable
		System.out.println(num2);       //20
		System.out.println(num5);       //50
	}
	
	
		
	public static void main(String[] args)
	{		
		Sample1 s1=new Sample1();
		s1.m1();
		s1.m2();
	}
}
