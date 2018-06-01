package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			File file = new File("sample.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			String line = null;
			while((line = br.readLine())!=null){
				System.out.println(line);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
