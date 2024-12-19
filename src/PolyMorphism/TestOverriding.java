package PolyMorphism;

public class TestOverriding 
{
	public static void main(String[] args) 
	{
//		Father f=new Father();
//		f.car();
//		f.money();
//		f.home();
		
		System.out.println("----");
		
		Son s=new Son();
		s.bike();
		s.car();
		s.money();
		s.home();
	}
}
