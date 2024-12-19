package Method;

public class Sample5 
{
	//4: non-static method call from diff class
	
	public static void main(String[] args) 
	{
		//step1: Create Object of diff/another class
		//step2: method call -> diffClassObject
		
		Sample6 s6=new Sample6();
		s6.m7();
		s6.m8();
		s6.m8();		
	}
}
