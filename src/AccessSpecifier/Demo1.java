package AccessSpecifier;

public class Demo1 
{
	public static void main(String[] args) 
	{
		System.out.println("running main method");
		Demo2.m1();
		Demo3.m2();
	}
}

class Demo2
{
	public static void m1() 
	{
		System.out.println("static method m1");
	}
}

class Demo3
{
	public static void m2() 
	{
		System.out.println("static method m2");
	}
}