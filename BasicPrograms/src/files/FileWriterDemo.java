package files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw =null;
		try {
			fw = new FileWriter("test.txt",true);
			/*fw.write("hello");
			fw.write("\n");
			char ch[] = {'a','e','i','o','u'};
			fw.write(ch);
			fw.write("\n");
			fw.write(100);*/
			
			fw.write("today is friday");
			
			fw.flush();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally{
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
