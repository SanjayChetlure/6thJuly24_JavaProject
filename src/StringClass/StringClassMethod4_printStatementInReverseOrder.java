package StringClass;
public class StringClassMethod4_printStatementInReverseOrder
{
	public static void main(String[] args) 
	{
		String s5="my name is abc";      //oup -> abc is name my
		
		String [] ar=s5.split(" ");         //{my(0)  name(1)   is(2)  abc(3)}

		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.print(ar[i]+" ");
		}
	}
}
