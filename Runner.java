package gmit;

public class Runner{

	public static void main(String[] args){

		SingleLinkedList<String> list = new SingleLinkedList<String>();
		list.add("Yvonne");
		list.add(new String("Anything i like"));
		list.addFirst("John");
		list.addAfter("Yvonne","Diddly");

		long start = System.currentTimeMillis();
		for(int i 0; i < 1000000; i++)
		list.addFirst("-"+i);

	/*Added in*/	System.out.println("Time: "+ (System.currentTimeMillis()-start));

		System.out.println("iterating");
		Iterator<String> i = list.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}


	}
}