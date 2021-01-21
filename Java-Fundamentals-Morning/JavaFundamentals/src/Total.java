import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Total{

    public static void main(String [] args) {
        marksList e = null;
        ArrayList<marksList> ml = new ArrayList<>();
        try {
            FileInputStream fileIn = new FileInputStream("C:\\Users\\Krishnakanth\\Desktop\\marksList.txt");
            ObjectInputStream objin = new ObjectInputStream(fileIn);
            ml = (ArrayList<marksList>) objin.readObject();
            objin.close();
            fileIn.close();
        } catch (IOException io) {
            io.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
            return;
        }
        
        Collections.sort(ml);
        int rank = 1;
        for(marksList m: ml) {
            m.setRank(rank++);
        }
        for(marksList m: ml) {
            System.out.println(m.getRank() + " " + m.getRoll() + " " + m.getTotalMarks());
        }
        File file = new File("C:\\Users\\Krishnakanth\\Desktop\\test_file.csv");
        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
            BufferedWriter bufferw = new BufferedWriter(fw);
            bufferw.write("Rank, RollNo, Marks");
            bufferw.newLine();

            for(marksList m: ml) {
                bufferw.write(m.getRank() + "," + m.getRoll() + "," + m.getTotalMarks());
                bufferw.newLine();
            }
            System.out.println("Data added to CSV");
            bufferw.close();
            fw.close();

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }



    }
}