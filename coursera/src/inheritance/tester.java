package inheritance;

public class tester {

	public static void main(String[] args) {
		Person p[] = new Person[6];
		p[0] = new Person();
		p[1] = new Student();
		p[2] = new Faculty();
		
		System.out.println("===========");
		System.out.println(p[0].toString());
		System.out.println(p[1].toString());
		System.out.println(p[2].toString());
		
		System.out.println("===========");
		
		p[3] = new Person("john doe");
		p[4] = new Student(420, "amish");
		p[5] = new Faculty(50000, "principal X");
		
		System.out.println("===========");
		System.out.println(p[3].toString());
		System.out.println(p[4].toString());
		System.out.println(p[5].toString());
	}

}
