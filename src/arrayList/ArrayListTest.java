package arrayList;

import equals.Employee;

import java.util.*;

/**
 * this program demonstrates the ArrayList class.
 * @version 1.11 2019-5-3
 * @author Chenhsuan
 */

public class ArrayListTest {
	public static void main(String[] args)  {
	    // fill the staff list with three Employee objects.
		ArrayList<Employee> staff = new ArrayList<>();

		staff.add(new Employee("Cral Cracker", 75000, 1987, 12, 15));
		staff.add(new Employee("Harry Hacker", 50000, 1989, 10, 1));
		staff.add(new Employee("Tony Tester", 40000, 1990, 3, 15));

		// raise everyone's salary by 5%.
		for (Employee e : staff)    {
			e.riseSalary(5);
		}

		// print out info
		for(Employee e : staff) {
			System.out.println("name = " + e.getName() + ", Salary = " + e.getSalary() +
								", hireDat = " + e.getHireDay());
		}
	}
}
