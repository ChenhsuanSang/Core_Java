package inheritance;

/**
 * This program demonstrates inheritance.
 * @version 1.21 2019-5-3
 * @author chenhusan
 */

public class ManagerTest {
	public static void main(String[] args) {
		// Construct Manager object.
		Manager boss = new Manager("Cral Cracker", 80000, 1987, 12, 15);
		boss.setBonus(5000);

		Employee[] staff = new Employee[3];

		// fill the staff array with Manager and Employee object
		staff[0] = boss;
		staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);

		// print out info ahout all Employee objects.
		for(Employee e : staff)	{
			System.out.println("name = " + e.getName() + ", salary = " + e.getSalary());
		}
	}
}
