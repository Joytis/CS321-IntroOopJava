import java.io.*;

import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;


public class DataAnalyzer {
	String path;

	public DataAnalyzer(String f) {
		path = f;
	}

	public void analyze() {
		List<String> stuff = openFile();
		int min = Integer.MAX_VALUE;
		int max = 0;
		int total = 0;
		int mean = 0;

		if(stuff != null) {
			for(ListIterator<String> it = stuff.listIterator(); it.hasNext(); ) {
				String s = it.next();
				int i = Integer.parseInt(s);
				if(i < min) min = i;
				if(i > max) max = i;
				total += i;
			}

			mean = total/stuff.size();
		}

		System.out.println("File analyzed: ");
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		System.out.println("Average: " + mean);
	}

	List<String> openFile() {

        String line = null;
		List<String> lines = null;

		try {

            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(path);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);


            lines = new ArrayList<String>();

            while((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }   

            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.err.println("Unable to open file '" + path + "'");
            ex.printStackTrace();
        }
        catch(IOException ex) {
            System.err.println("Error reading file '"+ path + "'");
            // Or we could just do this: 
            ex.printStackTrace();
        }

        return lines;
	}
}
