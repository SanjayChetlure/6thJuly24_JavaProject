package Array;
public class Ex4_DeclarationInitializationInSingleStep1_intArray
{
	public static void main(String[] args)
	{
		int [] ar= {30,10,40,20};       //length=4    si=0, ei=3
		
		System.out.println(ar[3]);
		System.out.println(ar.length);
		
		System.out.println("----print all data-----");
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
	}
}
