package StringClass;
public class StringClassMethod2
{
	public static void main(String[] args) 
	{
		String s1="velocity";
		String s2="abcd";
		String s3="xyz";
		String s4="   abc  xyz    ";
		String s5="my name is abc";
		
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3, 5));   // (SI, EI+1)     //3 to 5
		System.out.println(s1+s2+s3);      			    //velocityabcd
		System.out.println(s1.concat(s2).concat(s3));   //velocityabcd
		System.out.println(s4.trim());
		System.out.println(s5.replace("abc", "xyz"));		
	}
}
