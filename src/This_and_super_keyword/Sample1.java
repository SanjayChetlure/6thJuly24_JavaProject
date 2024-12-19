package This_and_super_keyword;
//sub class
public class Sample1 extends Sample2
{
	//int a=30;         //global variable from super class
	
	int a=20;         //global variable from same class
	
	
	public void m1() 
	{
		int a=10;             //local variable
		System.out.println(a);
		System.out.println(this.a);  //use to access global variable from same class 
		System.out.println(super.a);  //use to access global variable from super class 
	}
	
	
	public static void main(String[] args)
	{
		Sample1 s1=new Sample1();
		s1.m1();
	}
}
