package StringClass;
public class StringClassMethod3
{
	public static void main(String[] args) 
	{
		String s5="my name is abc";
		
		String [] ar=s5.split(" ");         //{my(0)  name(1)   is(2)  abc(3)}

		System.out.println(ar[2]);
		System.out.println(ar.length);
		
		System.out.println("------------");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
	}
}
