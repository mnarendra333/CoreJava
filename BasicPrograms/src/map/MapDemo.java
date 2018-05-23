package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(10, "John");
		map.put(20, "killer");
		map.put(35, "david");
		map.put(23, "chris");
		map.put(50, "jose");
		
		System.out.println(map);
		
		
		System.out.println(map.get(35));
		
		Set<Integer> obj = map.keySet();
		System.out.println(obj);
		
		Collection<String> values =map.values();
		System.out.println(values);
		System.out.println(values.getClass());
		
		
		System.out.println(map);
		
		Set<Entry<Integer, String>> data = map.entrySet();
		for (Entry<Integer, String> entry : data) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
		
		
		
		
		
		

	}

}
