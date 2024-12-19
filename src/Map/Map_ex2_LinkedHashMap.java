package Map;
import java.util.LinkedHashMap;
public class Map_ex2_LinkedHashMap
{
	public static void main(String[] args) 
	{
		LinkedHashMap<Integer, String> hm=new LinkedHashMap<>();
		hm.put(101, "ganesh");      //add new key & value
		hm.put(200, "Ramesh");
		hm.put(300, "suresh");
		hm.put(40, "ramesh");
		
		System.out.println(hm);
	}
}
