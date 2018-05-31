package set;

public class Employee implements Comparable<Employee>{
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", address=" + address + "]";
	}


	private int empId;
	private String empName;
	private String address;
	
	
	public int getEmpId() {
		return empId;
	}


	public String getEmpName() {
		return empName;
	}


	public String getAddress() {
		return address;
	}


	public Employee(int empId, String empName, String address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}


	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		/*int i1 = this.getEmpId();
		int i2 = o.getEmpId();
		return i1<i2?-1:i1>i2?1:0;*/
		
		Integer i1 = this.getEmpId();
		Integer i2 = o.getEmpId();
		
		return i1.compareTo(i2);
	}
	
	
	
	

}
