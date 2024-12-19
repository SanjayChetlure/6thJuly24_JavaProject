package Control_Statement;

public class ex4_if_else 
{
	public static void main(String[] args) 
	{
		int total=70;
		int maths=90;
		
		//   70>=60   |  90>=80
		if(total>=60  | maths>=80)               
		{
			System.out.println("Eligible");
		}
		else
		{
			System.out.println("not Eligible");
		}
				
		//  true  | true  -> true
		//  false | true ->  true
		//  true  | false -> true
		//  false | false -> false		
	}
}
