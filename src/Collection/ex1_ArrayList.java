package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ex1_ArrayList 
{
	public static void main(String[] args) 
	{
		//ArrayList al=new ArrayList();        //initial/by default capacity=10
		ArrayList al=new ArrayList(50);        //initial capacity=50
		al.add("rahul");
		al.add(101);
		al.add(65.5f);
		al.add('A');
		al.add(null);
		al.add(101);
		al.add(null);		
		
		System.out.println(al);
		System.out.println(al.size());          //7
		System.out.println(al.get(0));          //rahul
		System.out.println(al.contains(101));  //true
		System.out.println(al.isEmpty());      //false
		
		//update data
		al.set(0, "RAHUL");
		System.out.println(al);
		
		//add data in between Arraylist  -> right shift operation
		al.add(4, 500);
		System.out.println(al);
		
		//remove data in between Arraylist  -> left shift operation
		al.remove(4);
		System.out.println(al);
		
		
		System.out.println("------Print data using : for loop-------");
		for(int i=0; i<=al.size()-1; i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("------Print data using : for each loop-------");
		for(Object s1:al)
		{
			System.out.println(s1);
		}
		
		System.out.println("------Print data using : Iterator cursor-------");
		Iterator itr = al.iterator();     //copy all data from Arraylist to Iterator Object
										  //itr= [rahul, 101, 65.5, A, null, 101, null ]
		
		while(itr.hasNext())  //false
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println("------Print data using : ListIterator cursor-------");
		ListIterator litr = al.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("--------------");
		al.clear();
		System.out.println(al.size());
	}
}
