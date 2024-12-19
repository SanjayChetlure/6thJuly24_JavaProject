package Constructor;
public class Sample5
{
	int num1;   //100
	int num2;   //80
	
	//user defined constructor with parameter
	//2 int parameter constructor
	Sample5(int a, int b)   //a=100  b=80    //declaration
	{
		num1=a;  //100      //assign local variable into global
		num2=b;  //80
	}
	
	public void add() 
	{
		System.out.println(num1+num2);
	}
	
	public void sub()
	{
		System.out.println(num1-num2);
	}
		
	public static void main(String[] args)
	{
		Sample5 s5=new Sample5(5,6);
		s5.add();   //11
		s5.sub();   //-1
		
		System.out.println("----");
		
		Sample5 s6=new Sample5(100, 80);
		s6.add();
		s6.sub();
		
		System.out.println("------------------");
		
		Sample6 s7=new Sample6(8, 6);
		s7.sub();             //2
		
		Sample6 s8=new Sample6(4, 5);
		s8.sub();             // -1		
	}
}
