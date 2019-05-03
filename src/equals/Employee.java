package equals;

import java.time.*;
import java.util.Objects;

public class Employee {
	private String name;
	private double salary;
	private LocalDate hireDay;

	public Employee(String name, double salary, int year, int month, int day)   {
		this.name = name;
		this.salary = salary;
		this.hireDay = LocalDate.of(year, month, day);
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public LocalDate getHireDay() {
		return hireDay;
	}

	public void riseSalary(int byPercent){
		double rise = this.salary*byPercent/100;
		this.salary += rise;
	}

	@Override
	public boolean equals(Object obj) {
		// a quick test to see if the object are identical
		if(this == obj) return true;
		// must return false if the explicit parameter is null
		if(obj == null) return false;
		// if the class don't match, they can't be equal
		if(getClass() != obj.getClass())    return false;
		// now we know obj is a non-null Employee
		Employee other = (Employee) obj;

		// test whether the files have identical values
		return Objects.equals(this.name, other.name)
				&&  this.salary == other.salary
				&& Objects.equals(this.hireDay, other.hireDay);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, salary, hireDay);
	}

	@Override
	public String toString() {
		return getClass().getName() + "[name="+name+", salary="+salary+", hireday="+hireDay+"]";
	}
}