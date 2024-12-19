package Array;
public class Ex1_intArray
{
	public static void main(String[] args)
	{
		int [] ar=new int[4];        //index -> 0 to 3
		
		ar[0]=30;
		ar[1]=10;
		ar[2]=40;
		ar[3]=20;		
		
		System.out.println(ar[0]);         //30
		System.out.println(ar.length);     //4
		
		System.out.println("---print all data from int array--");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}	
	}
}
