package utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> al = new ArrayList<String>();
        al.add("green");
        al.add("orange");
        al.add("white");
        al.add("blue");
        al.add("yellow");
        
        
        Collections.sort(al,new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				// TODO Auto-generated method stub
				return s2.compareTo(s1);
			}
		});
        
        System.out.println(al);

	}

}
