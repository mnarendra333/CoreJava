package empcomparator;

public class Employee {
	
	
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


}
