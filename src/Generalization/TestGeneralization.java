package Generalization;
public class TestGeneralization 
{
	public static void main(String[] args) 
	{
		System.out.println("Features of Saving Acc:  ");
		SavingAcc saving=new SavingAcc();
		saving.CD();
		saving.CW();
		saving.MT();
		saving.newFeatureA();
		
		System.out.println("Features of Current Acc:  ");
		CurrentAcc current=new CurrentAcc();
		current.CD();
		current.CW();
		current.MT();
		current.newFeatureB();
		
		System.out.println("Features of Salary Acc:  ");
		SalAcc sal=new SalAcc();
		sal.CD();
		sal.CW();
		sal.MT();
	}
}
