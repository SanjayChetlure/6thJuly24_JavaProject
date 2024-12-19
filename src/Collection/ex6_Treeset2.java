package Collection;
import java.util.Iterator;
import java.util.TreeSet;
public class ex6_Treeset2 
{
	public static void main(String[] args)
	{
		TreeSet ts=new TreeSet();
		ts.add(104);
		ts.add(105);
		ts.add(101);
		ts.add(103);
		ts.add(102);
		ts.add(107);
		ts.add(106);
		ts.add("ubfasf");
		
		System.out.println(ts);
		System.out.println(ts.size());
		System.out.println(ts.contains(101));
		
		ts.remove(104);
		System.out.println(ts);
		
		System.out.println(ts.first());   //get first data
		System.out.println(ts.last());    //get last data
		
		ts.pollFirst();         //delete data from 1st position
		System.out.println(ts);
		
		ts.pollLast();			//delete data from last position
		System.out.println(ts);
		
		System.out.println("-----Print all data:  using for each loop------");
		for(Object s1:ts)
		{
			System.out.println(s1);
		}
		
		
		System.out.println("-----Print all data:  using Iterator cursor------");
		Iterator itr = ts.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		
		System.out.println("-----Print all data:  using Descending Iterator cursor------");
		Iterator ditr = ts.descendingIterator();
		while(ditr.hasNext()) 
		{
			System.out.println(ditr.next());
		}
	}
}
