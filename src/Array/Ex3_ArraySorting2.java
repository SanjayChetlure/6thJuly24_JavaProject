package Array;
import java.util.Arrays;
public class Ex3_ArraySorting2
{
	public static void main(String[] args)
	{
		String [] ar=new String[5];
				
		ar[0]="Rahul";
		ar[1]="Mahesh";
		ar[2]="Ganesh";
		ar[3]="Suresh";
		ar[4]="Amol";
		
		System.out.println("---Before Sorting----");
		for(int i=0; i<=4; i++)
		{   
			System.out.println(ar[i]);        
		}
		
		Arrays.sort(ar);
		
		System.out.println("---After Sorting----");
		for(int i=0; i<=4; i++)
		{   
			System.out.println(ar[i]);        
		}
	}
}
