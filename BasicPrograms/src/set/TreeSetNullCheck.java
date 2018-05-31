package set;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetNullCheck {
	
	public static void main(String[] args) {
		
		/*TreeSet<String> ts2 = new TreeSet<String>();
		ts2.add("hello");
		ts2.add(null);
		
		System.out.println(ts2);*/
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("hello");
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		
		
		
	}

}
