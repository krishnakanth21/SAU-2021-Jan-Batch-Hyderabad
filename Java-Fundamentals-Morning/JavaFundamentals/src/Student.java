import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Student {
     int marks;
     private String subject;
     int roll;
     public Student() {}
     public Student(int marks,String subject,int roll) {
    	 this.marks=marks;
    	 this.subject=subject;
    	 this.roll=roll;
     }
    @XmlElement
	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	@XmlElement
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@XmlElement
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}
}
