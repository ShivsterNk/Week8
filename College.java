// College class using composition to hold all the People, has Colleges HAS Students and Employees
import java.util.ArrayList;

public class College {
		
	private ArrayList<Person> people;
		
	public College() {
		
		this.people = new ArrayList<>();
	} 
		
	public void addPeople(Person person) {
		people.add(person);	
	}
		
	public void showPeople() {
		for (Person person : people) {
			System.out.println(person.getDetails());
		}
	}
	
	//Takes the overridden method to show all the people created in the Testing Person section
	public void readAllPeople() {
		for (Person person : people) {
			person.personDetails();
		}	
	}
}
