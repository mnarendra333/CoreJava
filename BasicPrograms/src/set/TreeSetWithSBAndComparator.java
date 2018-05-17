package set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetWithSBAndComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<StringBuffer> ts2 = new TreeSet<StringBuffer>(new Comparator<StringBuffer>() {

			@Override
			public int compare(StringBuffer arg0, StringBuffer arg1) {
				// TODO Auto-generated method stub
				String s1 = arg0.toString();
				String s2 = arg1.toString();
				return s1.compareTo(s2);
			}
		});
		ts2.add(new StringBuffer("sai"));
		ts2.add(new StringBuffer("amulya"));
		ts2.add(new StringBuffer("narendra"));
		ts2.add(new StringBuffer("kiran"));
		
		System.out.println(ts2);

	}

}
