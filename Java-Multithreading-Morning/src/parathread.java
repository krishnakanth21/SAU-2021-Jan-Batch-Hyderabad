import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class parathread extends Thread{
	@Override
	public void run() {
		try {
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
		System.out.println("(Through Thread)Number of paragraphs = " + paragraphCount);
		}catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    } catch (IOException e) {
				
				e.printStackTrace();
			}
	}
}
