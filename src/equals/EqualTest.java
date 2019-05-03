package equals;

/**
 * This program demonstrates the equals method.
 * @version 1.12 2012-01-26
 * @author Chenhsuan
 */

public class EqualTest {
	public static void main(String[] args)  {
		Employee alice1 = new Employee("Alice Admas", 75000, 1987, 12, 15);
		Employee alice2 = alice1;
		Employee alice3 = new Employee("Alice Admas", 75000, 1987, 12, 15);
		Employee bob = new Employee("Bob Brandson", 50000, 1989, 10, 1);
		
		System.out.println("alice1 == alice2: " + (alice1==alice2));
		System.out.println("alice1 == alice3: " + (alice1==alice3));
		System.out.println("alice.equal(alice3): " + alice1.equals(alice3));
		System.out.println("alice1.equals(bob): " + alice1.equals(bob));
		System.out.println("bob.toString(): " + bob);

		Manager cral = new Manager("Carl Cracker", 80000, 1987, 12, 15);
		Manager boss = new Manager("Cral Cracker", 80000, 1987, 12, 15);
		boss.setBonus(5000);

		System.out.println(boss);
		System.out.println(cral.equals(boss));

		System.out.println(alice1.hashCode());
		System.out.println(alice2.hashCode());
		System.out.println(bob.hashCode());
		System.out.println(cral.hashCode());

	}
}
