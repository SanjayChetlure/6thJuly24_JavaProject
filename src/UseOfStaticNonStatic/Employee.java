package UseOfStaticNonStatic;
public class Employee 
{
	String empName;
	int empId;
    static String empCEOName;
	
	
	public void empInfo()
	{
		System.out.println(empName+" : "+empId+" : "+empCEOName);
	}
}
