package Constructor;

public class Sample7 
{ 
	//4: multiple constructor -> constructor overloading
	
	int num1;       //50
	int num2;       //60
	String name;         //rahul
	
	//zero/without parameter constructor
	Sample7()
	{
		num1=10;
		num2=20;
	}
	
	//2 int parameter constructor
	Sample7(int a, int b)   //a=50, b=60
	{
		num1=a;       //50
		num2=b;       //60
	}
	
	//String parameter constructor
	Sample7(String s1)    //rahul
	{
		name=s1;    //rahul
	}
	
	
	public void add() 
	{
		System.out.println(num1+num2);
	}
	
	public void mul() 
	{
		System.out.println(num1*num2);
	}
	
	public void studentName()
	{
		System.out.println(name);
	}
	
	public static void main(String[] args)
	{
		Sample7 s7=new Sample7();
		s7.add();
		s7.mul();
		
		System.out.println("---------");
		
		Sample7 s8=new Sample7(50,60);
		s8.add();    
		s8.mul();	
		
		System.out.println("-----");
		
		Sample7 s9=new Sample7("rahul");
		s9.studentName();
	}
}
