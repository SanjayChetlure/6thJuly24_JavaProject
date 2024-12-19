package Variable;

public class Demo2 
{
	public static void main(String[] args)
	{
		//1. Variable declaration 
		String 	studnetName;					//dataType variableName;
		String  studentDept;
		int  studentRollNum;
		char studentGrade;
		float studentPer;
				
		//2. Variable Initialization(Assigning or Inserting value)
		studnetName="Amol";					//variableName="variableValue";
		studentDept="Electrical";
		studentRollNum=5;
		studentGrade='A';
		studentPer=60.2f;
			
		//3. Variable Usage
		System.out.println(studnetName);
		System.out.println(studnetName);	//info reuse
		System.out.println(studentDept);
		System.out.println(studentRollNum);
		System.out.println(studentGrade);
		System.out.println(studentPer);		
	}
	
}
