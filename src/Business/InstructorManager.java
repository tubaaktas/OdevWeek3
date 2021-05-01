package Business;
import Entities.Instructor;
import Entities.User;

public class InstructorManager extends UserManager {
	
	public void addUser(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" "+ "instructor added");
	}
	public void addCourse(Instructor instructor) {
		System.out.println("Course added : " + instructor.getCourse() );
	}
	public void addAbilty(Instructor instructor) {
		System.out.println("Ability : " + instructor.getAbility() );
	}

}
