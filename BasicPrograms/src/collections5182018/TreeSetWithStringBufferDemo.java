package collections5182018;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetWithStringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeSet<StringBuffer> ts = new TreeSet<StringBuffer>(new Comparator<StringBuffer>() {

			@Override
			public int compare(StringBuffer sb1, StringBuffer sb2) {
				// TODO Auto-generated method stub
				return sb1.toString().compareTo(sb2.toString());
			}
		});
		ts.add(new StringBuffer("sai"));
		ts.add(new StringBuffer("amulya"));
		ts.add(new StringBuffer("narendra"));
		ts.add(new StringBuffer("kiran"));
		ts.add(new StringBuffer("roopesh"));
		
		System.out.println(ts);

	}

}
