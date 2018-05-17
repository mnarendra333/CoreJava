package pack1;

class SuperClass{
	
	public void calculate(int x, int y){
		System.out.println(x+y);
	}
	
	public void method2(){
		System.out.println("i am from method2");
	}
	
}

public class SubClass extends SuperClass{
	
	
	
	public  void method2(){
		
	}
	
	public void mul(int x, int y){
		System.out.println(x*y);
	}
	
	
	

}
