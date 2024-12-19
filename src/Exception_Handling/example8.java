package Exception_Handling;
public class example8
{
	public static void main(String[] args) 
	{
		String s1="velocity";
		
		try
		{
			System.out.println(s1.charAt(9));         
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception handled");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds Exception handled");
		}
		catch(Exception e)			
		{
			System.out.println("Generic Exception Handled");
			e.printStackTrace();
		}		
		
		System.out.println("Hi");	
	}
}
