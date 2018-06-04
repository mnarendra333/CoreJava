package files;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileUtilsDemo {
	
	public static void main(String[] args) throws IOException {
		
		
		FileUtils.copyFile(new File("c:/1.jpg"), new File("D:/batch17/2.jpg"));
		
		
	}

}
