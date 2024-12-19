package Constructor;
public class Sample6 
{
	int num3;   //8
	int num4;   //6
	
	Sample6(int a, int b)  //a=8, b=6
	{
		num3=a;             //globalVariable=localVariable
		num4=b;
	}
	
	public void sub() 
	{
		System.out.println(num3-num4);
	}
}
