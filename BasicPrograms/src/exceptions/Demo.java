package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			m1();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}

	}

	private static void m1() throws FileNotFoundException {
		// TODO Auto-generated method stub
		m2();
	}

	private static void m2() throws FileNotFoundException {
		// TODO Auto-generated method stub
		m3();
	}

	private static void m3() throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileReader fr =new FileReader("abc.txt");
	}

}
