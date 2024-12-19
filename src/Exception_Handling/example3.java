package Exception_Handling;
public class example3
{
	public static void main(String[] args)
	{
		int num1=10;
		int num2=0;
		int num3=0;
				
		try
		{
			num3=num1/num2;    // 10/0  = 5    //risky code
		}
		catch(ArithmeticException e)
		{
			num3=num1/1;  //10/1=10     //alternate code
		}
		
		
		System.out.println(num3);
		System.out.println("Good morning");
	}
}
