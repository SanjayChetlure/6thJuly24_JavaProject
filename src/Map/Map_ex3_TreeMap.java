package Map;
import java.util.TreeMap;
public class Map_ex3_TreeMap
{
	public static void main(String[] args) 
	{
		TreeMap<Integer, String> hm=new TreeMap<>();
		hm.put(101, "ganesh");      
		hm.put(200, "Ramesh");
		hm.put(300, "suresh");
		hm.put(40, "ramesh");
		
		System.out.println(hm);
	}
}
