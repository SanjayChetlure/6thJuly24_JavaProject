package Exception_Handling;
public class example6
{
	public static void main(String[] args) 
	{
		String s1="velocity";
		
		try
		{
			System.out.println(s1.charAt(9));         //risky code
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception handled");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds Exception handled");
		}
		catch(StringIndexOutOfBoundsException a)
		{
			System.out.println("StringIndexOutOfBounds Exception handled");  //failure msg
		}
		
		System.out.println("Hi");	
	}
}
