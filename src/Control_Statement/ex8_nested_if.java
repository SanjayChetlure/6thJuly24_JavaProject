package Control_Statement;

public class ex8_nested_if 
{
	public static void main(String[] args)
	{
		
		int SA=7000;
		
		//7000>=500
		if(SA>=500)    //outer if
		{
			System.out.println("Free Delivery");
			
			//7000>=10000
			if(SA>=10000)   //inner/nested if
			{
				System.out.println("Additional 10% discount");
			}
			else
			{
				System.out.println("No Additional discount");
			}
		}
		else
		{
			System.out.println("RS 50 Delivery charges applied");
		}
	}
}
