package gmit;

public class SortRunner {
	public static void main(String[] args) throws Exception{
		Dictionary dictionary = new Dictionary(); //Instantiate the dictionary
		dictionary.load(); //Load the dictionary into memory
		
		Word[] shuffled = dictionary.getShuffledWords(); 
		//Sortable s = new SelectionSort();
		//Sortable s = new BubbleSort();
		//Sortable s = new InsertionSort();
		Sortable s = new QuickSort();
		
		Word[] sorted = s.sort(shuffled);
		
		for (int i = 0; i < sorted.length; i++) {
			Word word = sorted[i];
			System.out.println(word);
		}
	}
}
