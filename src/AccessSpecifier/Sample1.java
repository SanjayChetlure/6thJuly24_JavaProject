package AccessSpecifier;

public class Sample1
{
	private int num;  //private access specifier
	
	public Sample1()     //private access specifier
	{
		num=10;
	}
	
	private void squareOfNum()     //private access specifier
	{
		System.out.println(num*num);
	}
	
	
	public static void main(String[] args) 
	{
		Sample1 s1=new Sample1();
		s1.squareOfNum();
		System.out.println(s1.num);		
	}
}
