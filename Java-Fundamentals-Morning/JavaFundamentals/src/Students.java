import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Students {
   
	private ArrayList<Student> Student;
	public Students() {}
	public Students(ArrayList<Student> Student) {
		this.Student=Student;
	}
	
	@XmlElement
	public ArrayList<Student> getStudent() {
		return Student;
	}
	public void setStudent(ArrayList<Student> student) {
		Student = student;
	}
}
