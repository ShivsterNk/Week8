
public class TestingPerson {

	public static void main(String[] args) {
		
		College college = new College ();
		
		// Create people
		Person employeeOne = new Employee("Eric Cartman", 36, 982453271, "Academic Advisor\n");
		Person studentOne = new Student ("Danshina Anderson", 22, "Nursing");
		
		// Add them to the system
		college.addPeople(employeeOne);
		college.addPeople(studentOne);
		
		//Show them all
		System.out.println("People within this college: \n");
		college.readAllPeople();

	}

}
