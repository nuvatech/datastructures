package inheritance;

public class Student extends Person {

	int studentId;
	public Student() {
		System.out.println("Student - default constuctor - noarg");
		studentId = -1;
	}
	public Student(int id) {
		studentId = id;
	}
	public Student(int id, String name) {
		studentId = id;
		super.setName(name);
	}
	public String toString() {
		return ("student id = " + new Integer(studentId).toString() + " " + super.toString());
	}
	
}
