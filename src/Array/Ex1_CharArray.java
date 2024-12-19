package Array;
public class Ex1_CharArray
{
	public static void main(String[] args)
	{
		char [] ar=new char[4];        //index -> 0 to 3
		
		ar[0]='A';
		ar[1]='B';
		ar[2]='D';
		ar[3]='C';		
		
		System.out.println(ar.length);     //4
		
		System.out.println("---print all data from Char array--");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}	
	}
}
