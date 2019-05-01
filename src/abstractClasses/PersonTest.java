package abstractClasses;

/**
 * This progaram demonstrates abstract classes.
 * @version 1.01 2019-5-1
 * @author chenhusan
 */

public class PersonTest {
	public static void main(String[] args) {
		Person[] people = new Person[2];

		// fill the people with Student and Employee objects.
		people[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		people[1] = new Student("Maria", "Computer Science");

		// print out name and description of all Person objects.
		for(Person p : people)	{
			System.out.println(p.getName() + ", " + p.getDescription() + '.');
		}
	}
}
