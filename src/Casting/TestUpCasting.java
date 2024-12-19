package Casting;
public class TestUpCasting
{
	public static void main(String[] args) 
	{		
//		Son s=new Son();
//		s.mobile();
//		s.car();
//		s.money();
//		s.home();
		
		//create object of sub class with reference/dataType of super class
		
		 Father f=new Son();
		 f.car();
		 f.money();
		 f.home();	
	}
}
