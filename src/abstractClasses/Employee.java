package abstractClasses;

import java.time.*;

public class Employee extends Person {
	private double salary;
	private LocalDate hireDay;

	public Employee(String name, double salary, int year, int month, int day)	{
		super(name);
		this.salary  = salary;
		this.hireDay = LocalDate.of(year, month, day);
	}

	public double getSalary() {
		return salary;
	}

	public LocalDate getHireDay() {
		return hireDay;
	}

	@Override
	public String getDescription() {
		return String.format("an employee with salary of $%.2f", salary);
	}

	public void riseSalary(int byPercent) {
		double rise = this.salary * byPercent/100;
		this.salary += rise;
	}
}
