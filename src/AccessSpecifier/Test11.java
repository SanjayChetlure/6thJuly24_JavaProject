package AccessSpecifier;
public class Test11 
{
	public int a;
	
	public Test11()
	{
		a=20;
	}
	
	public void squareOfNum() 
	{
		System.out.println(a*a);
	}
		
	public static void main(String[] args)
	{
		Test11 t11=new Test11();
		t11.squareOfNum();
		System.out.println(t11.a);
	}
}
