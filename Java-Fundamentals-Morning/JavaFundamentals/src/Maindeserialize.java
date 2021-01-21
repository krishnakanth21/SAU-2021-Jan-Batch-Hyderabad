import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Maindeserialize {
    private static final String filepath="C:\\Users\\Krishnakanth\\Desktop\\marksList.txt";
    private static ArrayList<marksList> test  ;

    public static void main(String[] args) {


        try {

            File file = new File("student.xml");
            ArrayList<marksList> marklist = new ArrayList<>();
            JAXBContext jaxbContext = JAXBContext.newInstance(Students.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Students students = (Students) jaxbUnmarshaller.unmarshal(file);
            
            List<Student> list=students.getStudent();
            HashMap<Integer, Integer> markList = new HashMap<>();
            for(Student student :list) {
                if(markList.containsKey(student.getRoll())) {
                    int c = markList.get(student.getRoll());
                    c = c + student.getMarks();
                    markList.put(student.getRoll(), c);
                }
                else{
                    markList.put(student.getRoll(), student.getMarks());
                }
                System.out.println(student.getRoll() + " " + student.getMarks() + "  " + student.getSubject());
            }
         
            
            for (Map.Entry<Integer, Integer> e : markList.entrySet()) {
                marksList ml = new marksList(e.getKey(), e.getValue());
                marklist.add(ml);
            }
            Maindeserialize filenew = new Maindeserialize();
            filenew.Write(marklist);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void Write(ArrayList<marksList> student) {

        try {

            FileOutputStream filestream = new FileOutputStream(filepath);
            ObjectOutputStream output = new ObjectOutputStream(filestream);
            output.writeObject(student);
            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}  