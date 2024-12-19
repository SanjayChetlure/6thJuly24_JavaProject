package Collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public class ex4_Hashset2 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add("amol");
		al.add(101);
		al.add('A');
		al.add(75.5f);
		al.add(null);
		al.add(101);
		al.add(null);
		al.add('A');
		
		System.out.println(al);   //[amol, 101, A, 75.5, null, 101, null, A]
		
		
		HashSet hs=new HashSet(al);    //[amol, 101, A, 75.5, null]
		System.out.println(hs);
	}
}
