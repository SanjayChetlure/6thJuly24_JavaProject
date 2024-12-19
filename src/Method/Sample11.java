package Method;

public class Sample11
{
	public static void main(String[] args) 
	{
		studentName("amol");
		studentName("kartik");
		
		System.out.println("------------");
		
		studentFullName("abc1","xyz1");	
		studentFullName("abc2","xyz2");	
		
		System.out.println("-----------");
		
		studentInfo(1,"Amol", 101, 57.5f, 'B');
		System.out.println();
		studentInfo(2,"Ashwini", 102, 75.2f, 'A');
	}
	
	//method with String parameter
	public static void studentName(String name)   //name=""
	{
		System.out.println(name);   //
	}
	
	//method with 2 String(String, String) parameter
	public static void studentFullName(String FN, String LN)
	{
		System.out.println(FN+" "+LN);
	}
	
	//method with String,int, float, char parameter
	public static void studentInfo(int srNo,String name,int rollNum, float per, char grade) 
	{
		System.out.println("Sr No: "+ srNo);
		System.out.println("Student Grade: "+grade);
		System.out.println("Student Name: "+name);
		System.out.println("Student Roll Num: "+rollNum);
		System.out.println("Student Per: "+per+"%");		
	}

}
