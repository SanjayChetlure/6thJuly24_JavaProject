package TypesOfVariable;
public class Sample4 
{
	int c=30;     //non-static global variable
	
	
	public static void main(String[] args)
	{
		//1: non-static global variable call from same class
		Sample4 s4=new Sample4();            //create object of same class
		System.out.println(s4.c);			//variableCall -> objName.variableName
	
		//2: non-static global variable call from diff class
		Sample5 s5=new Sample5();
		System.out.println(s5.d);	
	}
	
	public static void m1() 
	{
		Sample4 s5=new Sample4();
		System.out.println(s5.c);
	}
	
	public void m2()
	{
		System.out.println(c);
	}
}
