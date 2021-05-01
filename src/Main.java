import Business.InstructorManager;
import Business.StudentManager;
import Business.UserManager;
import Entities.Instructor;
import Entities.Student;
import Entities.User;


public class Main {

	public static void main(String[] args) {

		Student student = new Student();
		student.setId(1);
		student.setFirstName("Tugba");
		student.setLastName("Aktas");
		student.setEmail("tubaa@tuba.com");
		student.setAddress("A mahallesi B caddesi Bayrampasa/Istanbul");
		student.setCardInfo("0000000 BankKart");
		student.setPassword("1234");
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.setEmail("engin@engin.com");
		instructor.setAbility("MCT - PMP - ITIL ");
		instructor.setCourse("Yazilim Gelistirici Yetistirici Kampý");
		
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addUser(instructor);//Çoklu ekleme örneði
		instructorManager.addCourse(instructor);
		instructorManager.addAbilty(instructor);
		
		System.out.println("-----------------------------------------------------");
		
		StudentManager studentManager=new StudentManager();
		studentManager.addUser(student);//Çoklu ekleme örneði
		studentManager.addAdress(student);
		studentManager.addCard(student);
		studentManager.editProfile(student);

		

	}

}
