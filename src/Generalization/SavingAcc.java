package Generalization;
//IC1
public class SavingAcc implements BankAcc
{
	public void CD()
	{
		System.out.println("CD: 10L");
	}

	public void CW()
	{
		System.out.println("CW: 5L");
	}

	public void MT() 
	{
		System.out.println("MT: 1L");
	}
	
	public void newFeatureA() 
	{
		System.out.println("new Feature A");
	}
}
