package Array;
import java.util.Arrays;
public class Ex3_ArraySorting1
{
	public static void main(String[] args)
	{
		int [] ar=new int[4];        		
		ar[0]=30;     //10
		ar[1]=10;	  //20
		ar[2]=40;	  //30
		ar[3]=20;	  //40
				
		System.out.println("---print origin data--");
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}	
		
		//Array Sorting
		Arrays.sort(ar);   //className.methodName();
		System.out.println("---print data after sorting(ascending order)--");
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("---print data in descending order--");
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.println(ar[i]);
		}		
	}
}
