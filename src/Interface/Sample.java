package Interface;
//sub class or implementation class
public class Sample implements I1, I2
{
	//example multiple inheritance using interface
		
	public void m1() 
	{
		System.out.println("method m1 from interface I1 completed in IC");
	}

	public void m2() 
	{
		System.out.println("method m2 from interface I1 completed in IC");
	}

	public void m3() 
	{
		System.out.println("method m3 from interface I2 completed in IC");
	}

	public void m4()
	{
		System.out.println("method m4 from interface I2 completed in IC");
	}	
}
