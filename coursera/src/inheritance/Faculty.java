package inheritance;

public class Faculty extends Person {

	int salary;
	
	public Faculty () {
		System.out.println("Faculty - default constuctor - noarg");
		salary = 0;
	}
	public Faculty (int sal, String name) {
		salary = sal;
		super.setName(name);
	}
	
	public String toString() {
		return ("salary = " + new Integer(salary).toString() + " " + super.toString());
	}
}
