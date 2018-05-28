package map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(45, "ravi");
		ht.put(62, "kiran");
		ht.put(91, "john");
		ht.put(23, "krunal");
		ht.put(65, "hardik");
		ht.put(16, "jadeja");
		ht.put(89, "rohit");
		ht.put(72, "ajay");
		
		System.out.println(ht);
		
		
		Set<Entry<Integer, String>> entrySet = ht.entrySet();
		/*for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}*/
		
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry =  iterator
					.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		
		
		
		
		
	}

}
