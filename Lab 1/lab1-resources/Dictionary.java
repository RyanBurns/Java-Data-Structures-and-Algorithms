package gmit;

import java.util.*;
import java.io.*;
public class Dictionary {
	private List<String> words = new ArrayList<String>();
	private final String DICTIONARY_FILE = "dictionary.txt";
	
	public void load() throws Exception{
		try {
			FileInputStream fstream = new FileInputStream(DICTIONARY_FILE);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			String next;
			while ((next = br.readLine()) != null)   {
			      words.add(next);
			}
			in.close();
		} catch (Exception e) {
			throw new Exception("[ERROR] Encountered a problem reading the dictionary. " + e.getMessage());
		}
	}
	
	public int size(){
		return words.size();
	}
	
	public String[] getSortedWords(){
		return (String[]) words.toArray(new String[words.size()]);
	}
}
