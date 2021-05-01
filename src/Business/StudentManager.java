package Business;
import Entities.Student;
import Entities.User;

public class StudentManager extends UserManager {
	
	public void addUser(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName() +" "+ "student added");
	} 
	
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
