package Constructor;
public class Sample3 
{
	//step1: declaration
	int num1;   //10
	int num2;   //20
	
	//step2: initialization
	//user defined constructor -> provided by user
	//use1: use to initialize global variables
	//use2: use to copy all the members of class into object
	Sample3()             //without/zero parameter constructor
	{
		num1=10;
		num2=20;
	}	
	
	//step3: usage
	public void add() 
	{
		System.out.println(num1+num2);
	}
	
	public void mult() 
	{
		System.out.println(num1*num2);
	}
	
	
	public static void main(String[] args) 
	{
		Sample3 s3=new Sample3();
		s3.add();
		s3.mult();
		
		System.out.println("--------------");
		
		Sample4 s4=new Sample4();
		s4.sub();
	}
}
