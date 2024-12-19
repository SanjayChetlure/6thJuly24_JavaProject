package Interface;

public class Test3 implements Test1
{

	public void m1() 
	{
		System.out.println("method m1 from interface Test1 completed in IC:Test3");		
	}

	@Override
	public void m2()
	{
		System.out.println("method m2 from interface Test1 completed in IC:Test3");	
	}
	
	public static void main(String[] args) 
	{
		Test3 t3=new Test3();
		t3.m1();
		t3.m2();
	}

}
