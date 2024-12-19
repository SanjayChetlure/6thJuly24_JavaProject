package Inheritance;

public class ex4_HirarchicleInheritance 
{
	public static void main(String[] args)
	{		
		System.out.println("----features of son1----");
		Son1 s1=new Son1();
		s1.bike();
		s1.car();
		s1.money();
		s1.home();
		
		System.out.println("----features of son2----");
		Son2 s2=new Son2();
		s2.mobile();
		s2.car();
		s2.money();
		s2.home();
		
		System.out.println("----features of son3----");
		Son3 s3=new Son3();
		s3.laptop();
		s3.car();
		s3.money();
		s3.home();	
	}
}
