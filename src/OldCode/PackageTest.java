package OldCode;

import com.horstmann.corejava.*;
// the Employee class is defined in that package.

import static java.lang.System.*;

/**
 * This program demonstrates the use of packages.
 * @version 1.11 2019-5-1
 * @author chenhusan
 */

public class PackageTest {
	public static void main(String[] args)	{
		// because of the import statement, we don't have to use
		// com.horstmann.corejava.Employee here.
		Employee harry = new Employee("Harry Hacker", 5000, 1998, 10, 1);

		harry.riseSalary(5);

		// because of the static import statement, we don't have to use System.out here
		out.println("name = " + harry.getName() + ", salary = " + harry.getSalary());
	}
}
