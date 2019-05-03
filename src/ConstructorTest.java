import java.util.*;

/**
 * This program demonstrates object construction.
 * @version 1.01 2019-4-30
 * @author Chenhsuan
 */

public class ConstructorTest {
	public static void main(String[] args)  {
	    // fill the staff array with three Employee objects
		tmpEmployee[] staff = new tmpEmployee[3];
		
		// System.out.println(tmpEmployee.getNextId());

		staff[0] = new tmpEmployee("Harry", 40000);
		staff[1] = new tmpEmployee(60000);
		staff[2] = new tmpEmployee();

		// print out info of all Employee obj
		for(tmpEmployee e : staff)  {
			System.out.println("name = " + e.getName() + ", id = " + e.getId() +
								", Salary = " + e.getSalary());
		}
	}
}

class tmpEmployee   {
	private static int nextId;

	private int id;
	private String name = "";   //instance filed initialization
	private double salary;

	// static initialization block
	static  {
		Random generator = new Random();
		nextId = generator.nextInt(100);
	}

	// object initialization block
	{
		id = nextId;
		nextId++;
	}


	//three overloaded constructors
	public tmpEmployee(String n, double s) {
		this.name = n;
		this.salary = s;
	}

	public tmpEmployee(double s)    {
		// calls the Employee(String, double) constructor
		this("Employee #" + nextId, s);
	}

	// the default construct
	public tmpEmployee()    {
		// name initialized to ""
		// salary not set yet (init to 0)
		// id init in init block
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public int getId() {
		return id;
	}

	public static int getNextId() {
		return nextId;
	}
}