//Inheritance as Student is a Person
public class Student extends Person {
	
	private String fieldstudy;
	
	public Student(String name, int age, String fieldstudy) {
		super(name, age);
		this.fieldstudy = fieldstudy;
	}
	
	//New form, overridden to add Student data
	public void personDetails() {
		System.out.println(super.getDetails() + "\nMajoring in the field of: " + fieldstudy);
	}
	
}
