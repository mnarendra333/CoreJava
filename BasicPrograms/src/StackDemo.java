import java.util.Stack;


public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Stack obj = new Stack();
		
		for (int i = 10; i <=100; i+=10) {
			obj.push(i);
		}
		obj.push(70);
		System.out.println(obj);
		for (Object object : obj) {
			System.out.println(object+"-->"+obj.search(object));
		}
		System.out.println(obj.search(100));
		//System.out.println(obj.search(70));
		
		
		

	}

}
