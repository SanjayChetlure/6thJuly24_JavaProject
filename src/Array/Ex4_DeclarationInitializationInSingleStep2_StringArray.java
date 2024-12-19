package Array;
public class Ex4_DeclarationInitializationInSingleStep2_StringArray
{
	public static void main(String[] args)
	{
		String [] ar= {"rahul","mahesh","ganesh","suresh","amol"};
	
		
		System.out.println(ar[3]);
		System.out.println(ar.length);
		
		System.out.println("----print all data-----");
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
	}
}
