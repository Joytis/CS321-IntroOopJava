import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {
	private int count = 0;

	public WordCounter(String file) {
		count = 0;
		countFile(file);
	}

	private void countFile(String file) {
		Scanner sc = null;
	    try {
	        sc = new Scanner(new File(file));
	    } 
	    catch (FileNotFoundException e) {
	        e.printStackTrace();  
	    }
	    while (sc.hasNextLine()) {
            Scanner sc2 = new Scanner(sc.nextLine());
	        while (sc2.hasNext()) {
	            String s = sc2.next();
	            count++;
	        }
	    }
	    
	}

	public int getCount() {
		return count;
	}
}
