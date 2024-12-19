package Interface;

public class Test2 implements Test1
{
	
	public void m1() 
	{
		System.out.println("method m1 from interface Test1 completed in IC:Test2");		
	}

	public void m2()
	{
		System.out.println("method m2 from interface Test1 completed in IC:Test2");	
	}
	
	public void m3()
	{
		System.out.println("default method from interface Test1 completed in IC: Test2");
	}
	
	
	
	
	public static void main(String[] args) 
	{
		Test2 t2=new Test2();
		t2.m1();
		t2.m2();
		t2.m3();
		
		Test5.getExcelData();
	}

}
