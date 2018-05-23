package iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		List<String> al = new ArrayList<String>();
        al.add("green");
        al.add("orange");
        al.add("white");
        al.add("blue");
        al.add("yellow");
        
        
        //print elements in forward direction
        
        ListIterator<String> iterator = al.listIterator();
        while (iterator.hasNext()) {
			String str =  iterator.next();
			if(str.equals("orange"))
				iterator.set(str+"-1");
			if(str.equals("white"))
				iterator.set(str+"-2");
			if(str.equals("green"))
				iterator.set(str+"-3");
			
			
			if(str == "orange" || str == "white" || str == "green")
				//iterator.previous();
				iterator.add("flag color");
			
			
			//System.out.println(str);
			
		}
        System.out.println(al);
        System.out.println("================================");
        //print elements in backword direction
       /* 
        while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
*/
	}

}
