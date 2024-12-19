package LogicalPrograms;
public class Number_ex1_addTwoNumberWithoutAdditionOperator
{
	public static void main(String[] args)
	{
		System.out.println(add(6, 5));
	}	
	
	public static int add(int a, int b)
	{
		for(int i=1; i<=a; i++)
		{
			b++;
		}
		return b;
	}
	
	
	
	
//	int a=6;
//	int b=5;
//	
//	for(int i=1; i<=a; i++)
//	{
//		b++;   //5
//	}
//	
//	System.out.println(b);
}