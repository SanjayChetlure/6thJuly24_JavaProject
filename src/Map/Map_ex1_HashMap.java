package Map;
import java.util.HashMap;
import java.util.Set;

public class Map_ex1_HashMap
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(101, "ganesh");      //add new key & value
		hm.put(200, "Ramesh");
		hm.put(300, "suresh");
		hm.put(40, "ramesh");
		
		System.out.println(hm);
		
		//verify specific available or not
		System.out.println(hm.containsKey(1));  //true
		
		//get value of specific key
		System.out.println(hm.get(1));   //ganesh
		
		//print all keys
		Set<Integer> allKeys = hm.keySet();
		for(Integer key:allKeys)
		{
			System.out.println(key);
		}
		
		//print all key & values
		for(Integer key:allKeys)
		{
			System.out.println(key+" : "+hm.get(key));
		}
		
		//update value of specific key
		hm.put(4, "RAMESH");
		System.out.println(hm);
	}
}
