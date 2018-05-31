package utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		List<Integer> list = Collections.synchronizedList(al);
		System.out.println(list);
		
		//Collections.synchronizedMap(arg)

	}

}
