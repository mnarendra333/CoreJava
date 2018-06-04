package files;

import java.io.PrintWriter;

public class PrintWriterDemo {
	
	public static void main(String[] args) {
		
		
		try {
			PrintWriter pw = new PrintWriter("names.txt");
			pw.print(100);
			pw.write(100);
			pw.write("hello");
			pw.write(new char[]{'a','e'});
			
			pw.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
