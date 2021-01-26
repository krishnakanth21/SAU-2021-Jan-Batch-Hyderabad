import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class sentencethread extends Thread{
	@Override
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("Book.txt"));
			int sentenceCount = 0;
			String line;
			String delimiters = "?!.";

			while ((line = reader.readLine()) != null) { 
			    for (int i = 0; i < line.length(); i++) {
			        if (delimiters.indexOf(line.charAt(i)) != -1) { 
			            sentenceCount++;
			        }
			    }
			}

			reader.close();
			System.out.println("(Through Thread)The number of sentences is " + sentenceCount);

		}catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    } catch (IOException e) {
				
				e.printStackTrace();
			}
	}
}
