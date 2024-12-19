package AccessSpecifier;

public class Test5 
{
	protected int a;
	
	protected Test5()
	{
		a=10;
	}
	
	protected void squareOfNum()
	{
		System.out.println(a*a);
	}
		
	public static void main(String[] args)
	{
		Test5 t5=new Test5();
		t5.squareOfNum();
		System.out.println(t5.a);
	}
}
