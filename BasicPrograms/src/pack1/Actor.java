package pack1;

public class Actor {
	
	
	private int id;
	private String name;
	private String address;
	
	
	public Actor(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public String toString(){
		
		return "Student["+id+","+name+","+address+"]";
	}

	public static void main(String[] args) {
		
		Actor obj1 = new Actor(101,"Kamal","bangl");
		//Actor obj2 = new Actor(102,"Kamal","bangl");
		
		//System.out.println(obj1.getClass()+"@"+Integer.toHexString(obj1.hashCode()));
		
		System.out.println(obj1);
		
	}
	
	
	
	
	
	
	
	
	

}
