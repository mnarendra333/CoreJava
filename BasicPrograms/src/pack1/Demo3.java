package pack1;

public class Demo3 {
	
	public static void main(String[] args) {
		
		
		/*String s1 = new String("hello");
		System.out.println(s1.getClass());*/
		
		
		/*Demo3 obj = new Demo3();
		System.out.println(obj.getClass().getName());*/
		
		
		Object obj[] = new Object[10];
		obj[0] = new Integer(10);
		obj[1] = new String("Ravi");
		obj[2] = new Float(10.5f);
		
		
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
		
		for (Object object : obj) {
			System.out.println(object);
		}
		
		
		
		
		
	}

}
