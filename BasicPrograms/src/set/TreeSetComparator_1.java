package set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparator_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> ts2 = new TreeSet<String>();
		ts2.add("sai");
		ts2.add("amulya");
		ts2.add("narendra");
		ts2.add("kiran");
		
		System.out.println(ts2);
		
		
		

	}

}
class MyComparator implements Comparator<String>
{

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return s2.compareTo(s1);
	}
	
}
