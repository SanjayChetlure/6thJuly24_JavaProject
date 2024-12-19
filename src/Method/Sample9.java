package Method;

public class Sample9 
{
	//6: method with parameter
	
	public static void main(String[] args) 
	{
		add(10, 20);      //30  //method call -> variable initialization
		add(50,60);       //110
		
		System.out.println("------");
		
		Sample9 s9=new Sample9();
		s9.sub(40, 50);     //-10
		s9.sub(600, 20);	//580
		
		System.out.println("----------------------");
		
		Sample10.mult(2, 5);    //10
		Sample10.mult(4, 3);    //12
		
		System.out.println("-------");
		
		Sample10 s10=new Sample10();
		s10.findSquareOfNum(5);    //25
		s10.findSquareOfNum(6);    //36
	}
		
	//method with 2 int(int, int) parameter
	public static void add(int num1,int num2)   //num1=0, num2=0     //variable Declaration
	{		
		System.out.println(num1+num2);	   //110	
	}
	
	
	public void sub(int num1, int num2) // num1=600,   num2=20
	{
		System.out.println(num1-num2);  //580
	}
}
