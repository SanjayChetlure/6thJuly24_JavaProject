package Exception_Handling;
public class example10 
{
	public static void main(String[] args) 
	{
		String [] ar= {"abc1", "xyz1", "abc2", "xyz2"};
		String s1="velocity";
		
		try
		{
			try
			{
				System.out.println(ar[8]);    //inner try block risky code
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Inner try block code handled");
			}
			
			System.out.println(s1.charAt(9));    //outer try block risky code
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Outer try block code handled");
		}
		
		
		System.out.println("Hi");
	}
}
