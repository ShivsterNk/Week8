
public class Person {

	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getDetails() {
		return "Name: " + name + "\nAge: " + age;
	}
	
	// This will get overwritten several times, in many forms throughout the program, showing polymorphism
	public void personDetails() {
		System.out.println("Person details: " + getDetails());
	}

}
