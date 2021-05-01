package Business;
import Entities.User;
import Log.Logger;

public class UserManager {
	/*public void addUser(User user) {
		System.out.println(user.getFirstName() +" "+ user.getLastName() +" "+ "Eklendi");
	}

	public void deleteUser(User user) {
		System.out.println(user.getFirstName() +" "+ user.getLastName() +" "+ "Silindi");
	}*/
	
	public void add(Logger logger) {
		System.out.println("User addition !" );
		logger.log();
	}

	public void delete(Logger logger) {
		System.out.println("User deletion !");
		logger.log();

	}
}
