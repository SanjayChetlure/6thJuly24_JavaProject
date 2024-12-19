package KeywordIndentifier;    //KeywordIndentifier ->packageName->identifier

public class Sample     //Sample ->className->identifier
{
	
	public static void main(String[] args)  // main -> methodName -> identifier
	{
		int num=10;  // num -> variableName -> identifier
		
		System.out.println(num);
		
		m1();
	}
	
	public static void m1()     // m1 -> methodName -> identifier
	{
		System.out.println();
	}
	
	public void m2()   // m2 -> methodName -> identifier
	{
		
	}
}
