import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class wordcounting {
	public void wcmethod() throws IOException {
		try {
			 String line;  
		        int count = 0;  
		          
		       
		        FileReader file = new FileReader("Book.txt");  
		        BufferedReader br = new BufferedReader(file);  
		              
		      
		        while((line = br.readLine()) != null) {  
		           
		            String words[] = line.split(" ");  
		           
		            count = count + words.length;  
		        }  
		          
		        System.out.println("Number of words in given file: " + count);  
		        br.close(); 
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		}

}
