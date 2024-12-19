package AccessSpecifier;

public class Test1 
{
	 int num;  //default access specifier
	
	 Test1()     //default access specifier
	{
		num=10;
	}
	
     void squareOfNum()     //default access specifier
	{
		System.out.println(num*num);
	}
	
	
	public static void main(String[] args) 
	{
		Test1 t1=new Test1();
		t1.squareOfNum();
		System.out.println(t1.num);		
	}

}
