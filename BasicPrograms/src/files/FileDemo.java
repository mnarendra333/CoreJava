package files;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	
	public static void main(String[] args) throws IOException {
		
		
		File file = new File("abc.txt");
		file.createNewFile();
		
		
		File file1  =new File("D://");
		File[] data = file1.listFiles();
		for (File file2 : data) {
			if(file2.isDirectory())
			System.out.println(file2.getAbsolutePath());
			
		}
		
		File file3 = new File("mydir","subdir");
		file3.mkdirs();
		
		File file4 = new File("abc.csv");
		file4.createNewFile();
		
		File file5 = new File("myexcel.xlsx");
		file5.createNewFile();
		
		
		
	}

}
