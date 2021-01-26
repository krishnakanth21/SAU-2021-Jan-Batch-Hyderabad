import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class sentence {
	public void scount() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("Book.txt"));
		int sentenceCount = 0;
		String line;
		String delimiters = "?!.";

		while ((line = reader.readLine()) != null) { // Continue reading until end of file is reached
		    for (int i = 0; i < line.length(); i++) {
		        if (delimiters.indexOf(line.charAt(i)) != -1) { // If the delimiters string contains the character
		            sentenceCount++;
		        }
		    }
		}

		reader.close();
		System.out.println("The number of sentences is " + sentenceCount);
	}
}
