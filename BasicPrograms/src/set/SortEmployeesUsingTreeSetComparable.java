package set;

import java.util.Set;
import java.util.TreeSet;

public class SortEmployeesUsingTreeSetComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Employee> ts = new TreeSet<Employee>();
		ts.add(new Employee(101, "John", "mumbai"));
		ts.add(new Employee(145, "Sunil", "chenni"));
		ts.add(new Employee(135, "Kiran", "hyd"));
		ts.add(new Employee(112, "Sai", "bangl"));
		ts.add(new Employee(99, "Aparanji", "noida"));
		ts.add(new Employee(142, "Nikhil", "pune"));
		
		System.out.println(ts);

	}

}
