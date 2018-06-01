package utility;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraysDemo {
	
	public static void main(String[] args) {
		
		
		Integer numbers[] = {10,50,45,29,46,33,77,89,61};
		
		Arrays.sort(numbers);
		
		for (int i : numbers) {
			System.out.print(i+" ");
		}
		
		
		Arrays.sort(numbers, new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) {
				// TODO Auto-generated method stub
				return i2.compareTo(i1);
			}
		});
		
		for (Integer integer : numbers) {
			System.out.println(integer);
		}
		
		
		
		List<Integer> list = Arrays.asList(numbers);
		System.out.println(list);
		
		//Arrays.binarySearch(numbers,3);
		
		
		Integer[] i2 = new Integer[10];
		
		
		Arrays.fill(i2, null);
		for (Integer integer : i2) {
			System.out.println(integer);
		}
		

	}

}
