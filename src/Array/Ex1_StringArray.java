package Array;
public class Ex1_StringArray
{
	public static void main(String[] args)
	{
		//1: Array declaration
		String [] ar=new String[5];
				
		//2: Array initialization
		ar[0]="Rahul";
		ar[1]="Mahesh";
		ar[2]="Ganesh";
		ar[3]="Suresh";
		ar[4]="Amol";
				
		ar[4]="Komal";     //reinitialize
		
		//3: Array Usage
		System.out.println(ar[0]);     //Rahul
		System.out.println(ar.length);
		
		System.out.println("-----Print all data from String Array-------");
		
		//           4<=4
//		for(int i=0; i<=4; i++)
//		{   //                 ar[4]
//			System.out.println(ar[i]);         //Rahul Mahesh Ganesh Suresh Amol
//		}
		
		
		for(int i=0; i<=ar.length-1; i++)
		{   
			System.out.println(ar[i]);         
		}	
	}
}
