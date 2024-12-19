package Constructor;
public class Sample4 
{	
	int num3;    //50
	int num4;    //40
	
	//user defined constructor -> provided by user
	//use1: use to initialize global variable
	//use2: copy all data into object
	Sample4()    //without/zero parameter constructor
	{
		num3=50;
		num4=40;
	}
		
	public void sub() 
	{
		System.out.println(num3-num4);
	}
}
