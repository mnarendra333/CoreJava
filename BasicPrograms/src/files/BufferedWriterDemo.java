package files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("sample.txt"));
			
			bw.write("hello");
			bw.newLine();
			char ch[] = {'a','e','i','o','u'};
			bw.write(ch);
			bw.newLine();
			bw.write(100);
			
			bw.flush();
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
