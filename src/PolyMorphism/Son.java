package PolyMorphism;
//child/sub class
public class Son extends Father
{
	public void bike() 
	{
		System.out.println("bike: FZ V3");
	}
	
	public void car()    //method overriding
	{
		System.out.println("car: BMW");
	}
	
	public void money() //method overriding
	{
		System.out.println("money: 2L");
	}
	
//	public void home() 
//	{
//		System.out.println("home: 2 BHK");
//	}
	
}
