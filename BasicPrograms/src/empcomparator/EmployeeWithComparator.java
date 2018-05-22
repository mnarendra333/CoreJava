package empcomparator;

import java.util.Comparator;
import java.util.TreeSet;



public class EmployeeWithComparator {
	
	public static void main(String[] args) {
		
		
		TreeSet<Employee> ts = new TreeSet<Employee>(new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				// TODO Auto-generated method stub
				String name1 = e1.getEmpName();
				String name2 = e2.getEmpName();
				
				if(name1.equals(name2)){
					Integer id1 = e1.getEmpId();
					Integer id2 = e2.getEmpId();
					
					return id1.compareTo(id2);
				}else{
					return name1.compareTo(name2);
				}
			}
		});
		ts.add(new Employee(101, "John", "mumbai"));
		ts.add(new Employee(145, "Sunil", "chenni"));
		ts.add(new Employee(135, "Sai", "hyd"));
		ts.add(new Employee(112, "Sai", "bangl"));
		ts.add(new Employee(99, "Aparanji", "noida"));
		ts.add(new Employee(142, "Nikhil", "pune"));
		
		System.out.println(ts);
		
	}

}
