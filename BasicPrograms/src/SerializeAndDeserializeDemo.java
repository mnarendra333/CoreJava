import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import serialization.Student;


public class SerializeAndDeserializeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//serialize the object
		
		
		Student obj = new Student(101,"Ravi","bangl");
		
		
		try {
			FileOutputStream fos = new FileOutputStream("student.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			
			
			
			//deserialization
			
			FileInputStream fis = new FileInputStream("student.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student s = (Student)ois.readObject();
			System.out.println(s.getStuId()+" "+s.getStuName()+" "+s.getAddress());
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
