import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		wordcounting w=new wordcounting();
	    w.wcmethod();
	    new sentence().scount();
	    new paracount().pcount();
		wordthread wt=new wordthread();
		wt.start();
		sentencethread st=new sentencethread();
		st.start();
		parathread pt=new parathread();
		pt.start();
	}

}
