package Collection;
import java.util.TreeSet;
public class ex6_Treeset1 
{
	public static void main(String[] args)
	{
		TreeSet ts=new TreeSet();
		ts.add("rahul");
		ts.add("mahesh");
		ts.add("ramesh");
		ts.add("suresh");
		ts.add("ganesh");
		ts.add("ramesh");
		//ts.add(null);    //nullPointerException
		
		System.out.println(ts);
	}
}
