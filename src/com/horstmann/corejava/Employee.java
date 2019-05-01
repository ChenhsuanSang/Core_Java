package com.horstmann.corejava;

// the Class in the file are part of this package.

import java.time.*;

/**
 * @version 1.11 2019-5-1
 * @author Chenhsuan
 */

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
}
