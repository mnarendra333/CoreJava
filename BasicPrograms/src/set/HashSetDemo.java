package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		/*HashSet<Integer> obj = new HashSet<Integer>();
		//internally uses map collection to allow only unique elements
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(10);
		System.out.println(obj);*/
		
		//i want to preserve the order of Set collection
		
	/*	LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		//internally uses map collection to allow only unique elements
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(40);
		lhs.add(10);
		System.out.println(lhs);*/
		
		// i want to sort the data
		
	/*	TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(45);
		ts.add(90);
		ts.add(30);
		ts.add(65);
		ts.add(50);
		ts.add(25);
		
		System.out.println(ts);
		System.out.println(ts.descendingSet());*/
		
		TreeSet<String> ts2 = new TreeSet<String>();
		ts2.add("sai");
		ts2.add("amulya");
		ts2.add("narendra");
		ts2.add("kiran");
		Object obj = new Object();
		
		System.out.println(ts2);
		
		
		
		
		
		
		
		
		
		
		
	}

}
