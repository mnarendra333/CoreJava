package serialization;

import java.io.Serializable;

public class Student implements Serializable{
	
	private int stuId;
	private String stuName;
	private String address;
	
	
	public int getStuId() {
		return stuId;
	}


	public String getStuName() {
		return stuName;
	}


	public String getAddress() {
		return address;
	}


	public Student(int stuId, String stuName, String address) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.address = address;
	}
	
	
	

}
