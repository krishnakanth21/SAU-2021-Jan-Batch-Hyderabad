import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;


@XmlRootElement(name = "assignments")
@XmlAccessorType(XmlAccessType.FIELD)
public class Assignments {
    List<Assignment> assignmt;

    @XmlElement(name = "assignment")
    public List<Assignment> getAssignment() {
        return assignmt;
    }

    public void setAssignment(List<Assignment> assignmt) {
        this.assignmt = assignmt;
    }
}