package Control_Statement;

public class ex5_else_if
{
	public static void main(String[] args)
	{
		int marks=32;
		
		// 32>=65
		if(marks>=65)
		{
			System.out.println("Distinction");
		}
		//        32>=60  &  58<=64
		else if(marks>=60 & marks<=64)		//60 - 64   60,61,62,63,64
		{
			System.out.println("1st class");
		}
		//      32>=50   &  58<=59
		else if(marks>=50 & marks<=59)       //50 - 59
		{
			System.out.println("2nd class");
		}
		//      32>=35   & 40<=49
		else if(marks>=35 & marks<=49)       //35 - 49
		{
			System.out.println("Pass");
		}
		//32<35
		else if(marks<35)      //else if(marks<=34)      
		{
			System.out.println("Fail");
		}
	}
}
