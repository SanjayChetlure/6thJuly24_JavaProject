package LogicalPrograms;
public class String_ex2_ReverseEachWordInStatement1
{
	public static void main(String[] args) 
	{	
		String s1="my name is abc";      // ym eman si cba
				
		String [] ar=s1.split(" ");      // {my(0), name(1), is(2), abc(3)} 
		
		//           1<=3
		for(int i=0; i<=ar.length-1; i++)      
		{				//  1
			String org = ar[i];     //name
			
			String rev="";
			for(int j=org.length()-1; j>=0; j--) 
			{
				rev=rev+org.charAt(j);
			}
			System.out.print(rev+" ");      //ym 
		}	
	}
}