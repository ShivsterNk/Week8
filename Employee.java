
public class Employee extends Person {
	
	private String occupation;
	private int ID;
	
	public Employee(String name, int age, int ID, String occupation) {
		super(name, age);
		this.ID = ID;
		this.occupation = occupation;
	}
	
	// This will get overwritten several times, in many forms throughout the program
	public void personDetails() {
		System.out.println(super.getDetails() + "\nID: " + ID + "\nWorks in: "  + occupation);
	}
}
