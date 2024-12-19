package Abstract_Concrete_Class;
//abstract => incomplete
//Concrete => complete

//incomplete or abstract class
abstract public class Demo1 
{
	
	//complete method
	public void m1()     //method declaration
	{
		System.out.println("method m1 completed in abstract class");               //method body
	}
		
	//incomplete method
	abstract public void m2();            //method declaration
	
	//incomplete method
	abstract public void m3();            //method declaration
}
