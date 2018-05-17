package pack1;

class Person {

	int id;
	private String name;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public double squre(double number){
		//System.out.println(Math.pow(number, 2));
		return Math.pow(number, 2);
	}

}

public class Student extends Person {

	private int marks;

	public Student(int id, String name, int marks) {
		super(id, name);
		this.marks = marks;

	}
	
	public void method2(){
		System.out.println(super.id);
		double value = super.squre(10);
		System.out.println(value);
	}

	public static void main(String[] args) {

		Student obj = new Student(101, "ravi", 300);
		obj.method2();
		
		
		
	}

}
