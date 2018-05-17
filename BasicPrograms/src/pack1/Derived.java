package pack1;

class Base{
	
	int a;
	int b;
	
	
	public Base(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	
	
}

public class Derived extends Base{

	public Derived(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String[] args) {
		
		
		
		Derived obj = new Derived(10,20);
		try {
			Thread.sleep(120000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	
	

}
