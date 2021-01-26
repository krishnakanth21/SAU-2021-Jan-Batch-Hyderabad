import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class wordthread extends Thread{
wordthread(){
		
	}
	@Override
	public void run() {
		try {
			 String line;  
		        int count = 0;  
		        FileReader file = new FileReader("Book.txt");  
		        BufferedReader br = new BufferedReader(file);     
		         
		        while((line = br.readLine()) != null) {  
		             
		            String words[] = line.split(" ");  
		           
		            count = count + words.length;  
		        }  
		          
		        System.out.println("(Through Thread)Number of words present in given file: " + count);  
		        br.close(); 
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    } catch (IOException e) {
				
				e.printStackTrace();
			}
	}

}
