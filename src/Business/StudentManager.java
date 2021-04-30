package Business;
import Entities.Student;

public class StudentManager extends UserManager {
	
	public void addAdress(Student student) {
		System.out.println( student.getAddress() +" "+ "address added");
	}
	
	public void editProfile(Student student) {
		System.out.println(student.getFirstName() +" "+ "profile edited");
	}
	
	public void addCard(Student student) {
		System.out.println(student.getCardInfo() +" "+ "card added");
	}
}
