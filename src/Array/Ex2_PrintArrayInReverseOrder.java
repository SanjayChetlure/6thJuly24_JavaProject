package Array;
public class Ex2_PrintArrayInReverseOrder
{
	public static void main(String[] args)
	{
		int [] ar=new int[4];        		
		ar[0]=30;
		ar[1]=10;
		ar[2]=40;
		ar[3]=20;		
				
		System.out.println("---print origin data--");
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}	
		
		
		System.out.println("---print Array in Reverse order--");
		//          3           -1>=0
		for(int i=ar.length-1; i>=0; i--)
		{  //                     2
			System.out.println(ar[i]);     //20 40 10 30
		}	
	}
}
