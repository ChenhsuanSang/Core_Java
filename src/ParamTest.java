/**
 * This program demonstrates parameter in Java.
 * @version 1.00 2019-4-30
 * @author Chenhsuan
 *//*


import java.lang.*;

public class ParamTest {
	public static void main(String[] args)	{
		// Test1 1: Methods can't modify numeric parameters.
		System.out.println("Testing tripleValue:");
		double percent = 10;
		System.out.println("Before: percent = " + percent);
		tripleValue(percent);
		System.out.println("After: percent = " + percent);


// Test 2: Methods can change the state of object parameters.
		System.out.println("\nTesting tripleSalary:");
		Employee harry = new Employee("Harry", 5000.0);
		System.out.println("Before: Salary = " + harry.getSalary());
		tripleSalary(harry);
		System.out.println("After: Salary = " + harry.getSalary());

		// Test 3: Methods can't attach new object to object parameters
		System.out.println("\nTesting swap:");
		Employee a = new Employee("Alice", 70000);
		Employee b = new Employee("Bob", 60000);
		System.out.println("Before: a = " + a.getSalary());
		System.out.println("Before: b = " + b.getSalary());
		swap(a, b);
		System.out.println("After: a = " + a.getSalary());
		System.out.println("After: b = " + b.getSalary());

	}

	public static void tripleValue(double x)	{
		x = 3*x;
		System.out.println("End of methods: x = " + x);
	}

	public static void tripleSalary(Employee x)	{
		x.raiseSalary(200);
		System.out.println("End of method: salary = " + x.getSalary());
	}

	public static void swap(Employee x, Employee y)	{
		Employee tmp = x;
		x = y;
		y = tmp;
		System.out.println("End of method: x = " + x.getSalary() );
		System.out.println("End of method: y = " + y.getSalary() );
		
	}
}

class Employee {
	private String name;
	private double salary;

	public Employee(String n, double s)	{
		this.name = n;
		this.salary = s;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void raiseSalary(double byPercent)	{
		double raise = this.salary * byPercent/100;
		this.salary += raise;
	}
}
*/
