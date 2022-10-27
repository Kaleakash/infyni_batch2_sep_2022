package education.main;

//import education.college.Attendance;

//import education.college.Attendance;
//import education.school.Attendance;

public class DemoTest {

	public static void main(String[] args) {
		education.college.Attendance att1 = new education.college.Attendance();
		att1.display();	
		
		education.college.Attendance att3 = new education.college.Attendance();
		att3.display();
		
		education.school.Attendance att2 = new education.school.Attendance();
		att2.display();
	}

}
