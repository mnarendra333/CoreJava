package iterators;

import java.util.Enumeration;
import java.util.Vector;

public class EnumarationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Vector<Integer> vector = new Vector<Integer>();
		for (int i = 10; i <=100; i+=10) {
			vector.add(i);
		}
		System.out.println(vector);
		
		
		//using normal for loop
		for (int i = 0; i < vector.size(); i++) {
			System.out.print(vector.get(i)+" ");
		}
		System.out.println("");
		System.out.println("=============================");
		
		//using foreach loop
		
		for (Integer integer : vector) {
			System.out.print(integer+" ");
		}
		
		System.out.println("");
		System.out.println("=============================");
		
		
		Enumeration<Integer> data  = vector.elements();
		while (data.hasMoreElements()) {
			Integer integer =  data.nextElement();
			System.out.println(integer);
			
		}
		
		
		
		
		
		
		
		

	}

}
