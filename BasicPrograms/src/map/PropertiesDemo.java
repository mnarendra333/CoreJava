package map;

import java.io.FileInputStream;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;

public class PropertiesDemo {
	
	public static void main(String[] args) {
		
		
		try {
			FileInputStream fis = new FileInputStream("connection.properties");
			
			Properties props = new Properties();
			props.load(fis);
			
			System.out.println(props.getProperty("jdbc.driver"));
			System.out.println(props.getProperty("jdbc.url"));
			System.out.println(props.getProperty("jdbc.username"));
			System.out.println(props.getProperty("jdbc.password"));
			
			//get all the values in one go...!
			Enumeration<Object> elements = props.elements();
			while (elements.hasMoreElements()) {
				System.out.println(elements.nextElement());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
