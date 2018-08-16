import java.util.Map;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashDictionary {
	
	private ArrayList<ArrayList<String>> storage;
	private int size;
	private int col;

	private void readFromFile(String filename) {
		try {
			File file = new File(filename);
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				int h = hash(line);
				if(!storage.get(h).isEmpty()){
					col++;
				}
				storage.get(hash(line)).add(line);
			}
			fileReader.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	private int hash(String str) 
	{
		return (Math.abs(str.hashCode()) % size);
	}

	public HashDictionary(String filename, int sz) {
		col = 0;
		size = sz;
		storage = new ArrayList<ArrayList<String>>();
		for(int i = 0; i < size; i++){
			storage.add(new ArrayList<String>());
		}
		readFromFile(filename);
	}

	public int empty() {
		int i = 0;
		for(ArrayList<String> ar : storage){
			if(ar.isEmpty()){
				i++;
			}
		}
		return i;
	}

	public int count() {
		return col;
	}

	public int size() {
		int i = 0;
		for(ArrayList<String> ar : storage){
			if(!ar.isEmpty()){
				i++;
			}
		}
		return i;
	}

	public int collision() {
		return 0;
	}

	public int find(String s) {
		return hash(s);
	}
}
