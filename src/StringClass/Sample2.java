package StringClass;

public class Sample2 
{
	public static void main(String[] args)
	{
		//Object creation without using new keyword -> constant pool area
		String s1="abc";
		String s2="abc";
		
		String s3="abc1";
		String s4="abc";
		
		
		//Object creation using new keyword -> non-constant pool area
		String s5=new String("abc");
		String s6=new String("abc");
		
		String s7=new String("abc1");
		
		
		System.out.println(s1==s2);   //true
		System.out.println(s1==s3);   //false
		
		System.out.println(s5==s6);   //false
		System.out.println(s1==s5);   //false
	}

}
