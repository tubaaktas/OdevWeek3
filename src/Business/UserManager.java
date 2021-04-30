package Business;
import Entities.User;

public class UserManager {
	public void addUser(User user) {
		System.out.println(user.getFirstName() +" "+ user.getLastName() +" "+ "Eklendi");
	}

	public void deleteUser(User user) {
		System.out.println(user.getFirstName() +" "+ user.getLastName() +" "+ "Silindi");
	}
	
}
