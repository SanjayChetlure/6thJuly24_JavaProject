package Control_Statement;

public class ex7_nested_if
{
	public static void main(String[] args)
	{		
		int PEM=400;
		int MEM=900;
		
		// 400>=350
		if(PEM>=350)            //outer if
		{
			System.out.println("Eligible for mains Exam");
			//900>=800
			if(MEM>=800)         //inner/nested if
			{
				System.out.println("Got Selected");
			}
			else
			{
				System.out.println("Rejected from Mains Exam MEM<800");
			}
			
		}
		else
		{
			System.out.println("Not Eligible for mains Exam PEM<350");
		}	
	}
}
