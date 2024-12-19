package StringClass;
public class Sample1 
{
	public static void main(String[] args)
	{
		//Object creation of String
		//1: without using new keyword
		String s1="abc";
		
		//2: using new keyword
		String s2=new String("abc1");
		
		
		String s3;     //only declaration
		String s4="abc2";    //declaration & initialization
		
		
		String s5="ab";                  //obj1
		System.out.println(s5);
		
		s5=s5+"cd";             // ab + cd  = abcd        //obj2
		System.out.println(s5);
				
		s5=s5+"xyz";       //abcd + xyz = abcdxyz         //obj3
		System.out.println(s5);	
	}
}
