package pack1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//first way
		/*ArrayList<String> al = new ArrayList<String>();
		
		List list  = new ArrayList();
		
		Collection c = new ArrayList();*/
		
		
		ArrayList al = new ArrayList();
		for (int i = 10; i <=100; i=i+10) {
			al.add(i);
		}
		
		/*System.out.println(al.size());
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
		al.clear();
		System.out.println(al);*/
		
		/*al.remove(new Integer(10));
		System.out.println(al);
		
		System.out.println(al.isEmpty());
		al.clear();
		System.out.println(al.isEmpty());*/
		
		
		ArrayList al2 = new ArrayList();
		
		al2.add(200);
		al2.add(300);
		al2.add(400);
		System.out.println(al);
		System.out.println(al2);
		
		al.addAll(al2);
		System.out.println(al);
		
		al.add(56);
		al.add(56);
		al.add(56);
		al.add(56);
		System.out.println(al);
		
		
		
	

	}

}
