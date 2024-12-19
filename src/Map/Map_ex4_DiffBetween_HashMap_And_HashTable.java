package Map;
import java.util.HashMap;
import java.util.Hashtable;
public class Map_ex4_DiffBetween_HashMap_And_HashTable
{
	public static void main(String[] args) 
	{		
//		Hashtable ht=new Hashtable<>();
//		ht.put("ramesh", 1);
//		ht.put("mahesh", null);
//		ht.put("ganesh", null);
//		ht.put(null, 1);
//		
//		System.out.println(ht);
				
		
		HashMap mp=new HashMap<>();
		mp.put("ramesh", 1);
		mp.put("mahesh", null);
		mp.put("ganesh", null);
		mp.put(null, 1);
		
		System.out.println(mp);		
	}
}
