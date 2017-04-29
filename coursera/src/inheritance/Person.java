package inheritance;

class Person {

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person() {
		System.out.println("Person - default constuctor - noarg");
		name = "naname";
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public String toString() {
		return ("name = " + name.toUpperCase());
	}
}
