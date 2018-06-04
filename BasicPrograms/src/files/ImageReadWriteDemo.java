package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ImageReadWriteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream source = new FileInputStream("C:/1.jpg");
			FileOutputStream dest = new FileOutputStream("D:/batch17/target.jpg");
			
			int k;
			while((k = source.read())!=-1){
				System.out.print((char)k);
				dest.write((char)k);
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
