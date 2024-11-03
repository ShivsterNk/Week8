
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
	
	public void personDetails() {
		System.out.println("Person details: " + getDetails());
	}

}
