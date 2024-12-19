package Exception_Handling;

public class example13
{
	public static void main(String[] args) {
		
		String s1="velocity";
		try
		{
			System.out.println(s1.charAt(0));         //risky code
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBounds Exception handled");
			System.exit(0);
		}
		finally 
		{
			System.out.println("running finally block");
		}
		
		
		System.out.println("Hi");
		System.out.println("Hello");			
	}
}
