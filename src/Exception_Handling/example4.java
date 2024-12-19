package Exception_Handling;
public class example4
{
	public static void main(String[] args)
	{
		int [] ar= {10,50,30,20,40};
		
	
		try
		{
			System.out.println(ar[9]);       //risky code
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds Exception handled");  //failure msg
			System.out.println(ar[0]);   //   alternate code
		}
		
		
		System.out.println("hi");
		System.out.println("Hello");
	}
}
