package Array;
import java.util.Arrays;
public class Ex3_ArraySorting_find_Smallest_and_highestNumFromArray
{
	public static void main(String[] args)
	{
		int [] ar=new int[4];        		
		ar[0]=30;    
		ar[1]=10;	  
		ar[2]=40;	  
		ar[3]=20;	
		
		Arrays.sort(ar);
		
		System.out.println(ar[0]);       //smallest num
		System.out.println(ar[ar.length-1]);       //highest num					
	}
}
