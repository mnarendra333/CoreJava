package collections5182018;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparatorWithPredefined2 {
	
	public static void main(String[] args) {
		
		
		TreeSet<String> ts = new TreeSet<String>(new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				// TODO Auto-generated method stub
				return -s1.compareTo(s2);
			}
		});
		ts.add("sai");
		ts.add("amulya");
		ts.add("narendra");
		ts.add("kiran");
		ts.add("roopesh");
		
		System.out.println(ts);
		
		
	}

}
