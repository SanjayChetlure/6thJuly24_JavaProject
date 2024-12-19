package Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;
public class ex2_Vector 
{
	public static void main(String[] args) 
	{
		Vector v=new Vector();        //initial capacity=10
		v.add("rahul");
		v.add(101);
		v.add(65.5f);
		v.add('A');
		v.add(null);
		v.add(101);
		v.add(null);		
		
		
		System.out.println(v.capacity());
		System.out.println(v);
		System.out.println(v.size());          //7
		System.out.println(v.get(0));          //rahul
		System.out.println(v.contains(101));  //true
		System.out.println(v.isEmpty());      //fvse
		
		//update data
		v.set(0, "RAHUL");
		System.out.println(v);
		
		//add data in between vector  -> right shift operation
		v.add(4, 500);
		System.out.println(v);
		
		//remove data in between vector  -> left shift operation
		v.remove(4);
		System.out.println(v);
		
		
		System.out.println("------Print data using : for loop-------");
		for(int i=0; i<=v.size()-1; i++)
		{
			System.out.println(v.get(i));
		}
		
		System.out.println("------Print data using : for each loop-------");
		for(Object s1:v)
		{
			System.out.println(s1);
		}
		
		System.out.println("------Print data using : Iterator cursor-------");
		Iterator itr = v.iterator();     //copy all data from vector to Iterator Object
										  //itr= [rahul, 101, 65.5, A, null, 101, null ]
		
		while(itr.hasNext())  //
		{
			System.out.println(itr.next());
		}
		
		System.out.println("------Print data using : ListIterator cursor-------");
		ListIterator litr = v.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("------Print data using : Enumeration cursor-------");
		Enumeration enu = v.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		
		System.out.println("--------------");
		v.clear();
		System.out.println(v.size());	
	}
}
