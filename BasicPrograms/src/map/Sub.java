package map;

class Super{
	
	public static void m1(){
		System.out.println("super class m1");
	}
	
}
class Sub extends Super{

	public static void m1(){
		System.out.println("sub class m1");
	}
	
	public static void main(String[] args) {
		
		
		Super obj  =new Sub();
		obj.m1();
		
		
	}
	
	

}
