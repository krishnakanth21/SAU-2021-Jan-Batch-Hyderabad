import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class paracount {
	public void pcount() throws IOException {
		String line; 
		int paragraphCount=0;
		BufferedReader reader = new BufferedReader(new FileReader("Book.txt"));
		while((line = reader.readLine()) != null) 
        { 
            if(line.equals("")) 
            { 
                paragraphCount++; 
            }  
        } 
		System.out.println("No of paragraphs = " + paragraphCount);
	}
}
