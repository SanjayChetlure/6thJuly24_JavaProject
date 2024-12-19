package UseOfStaticNonStatic;
public class TestEmployee
{
	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		e1.empName="amol";
		e1.empId=101;
		//e1.empCEOName="abc1";
		Employee.empCEOName="abc1";
		
		Employee e2=new Employee();
		e2.empName="Ajay";
		e2.empId=102;
		//e2.empCEOName="abc1";
		Employee.empCEOName="abc1";
		
		Employee e3=new Employee();
		e3.empName="Rakesh";
		e3.empId=103;
		//e3.empCEOName="xyz1";
		Employee.empCEOName="xyz1";
		
		
		e1.empInfo();
		e2.empInfo();
		e3.empInfo();
	}
}
