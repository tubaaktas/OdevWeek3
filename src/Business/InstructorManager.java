package Business;
import Entities.Instructor;

public class InstructorManager extends UserManager {
	public void addCourse(Instructor instructor) {
		System.out.println("Course added : " + instructor.getCourse() );
	}
	public void addAbilty(Instructor instructor) {
		System.out.println("Ability : " + instructor.getAbility() );
	}

}
