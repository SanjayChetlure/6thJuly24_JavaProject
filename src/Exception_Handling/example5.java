package Exception_Handling;
public class example5
{
	public static void main(String[] args)
	{
		String s1="velocity";
		
		try
		{
			System.out.println(s1.charAt(9));         //risky code
		}
		catch(StringIndexOutOfBoundsException a)
		{
			System.out.println("StringIndexOutOfBounds Exception handled");  //failure msg
		}
		
		
		System.out.println("Hi");
		System.out.println("Hello");		
	}
}
