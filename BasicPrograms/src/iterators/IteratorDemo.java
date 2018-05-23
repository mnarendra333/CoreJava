package iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//API
		/* public abstract boolean hasNext();
		  public abstract E next();
		  public void remove();
		  public void forEachRemaining(java.util.function.Consumer<? super E>);*/

		List<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(1);
        al.add(2);
 
        // Remove elements smaller than 10 using
        // Iterator.remove()
       /* Iterator<Integer> itr = al.iterator();
        while (itr.hasNext())
        {
            int x = itr.next();
            if (x < 10)
                itr.remove();
        }*/
        
        for (Integer integer : al) {
        	if(integer<10){
        	al.remove(integer);
        	}
		}
 
        System.out.println("Modified ArrayList : "
                                           + al);

	}

}
