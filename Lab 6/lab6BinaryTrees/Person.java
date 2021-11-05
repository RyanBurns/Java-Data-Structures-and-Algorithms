package gmit;

public class Person implements Item, Comparable<Item>{
	private String name;
	private int page;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.page = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int process() {
		return page;
	}
	
	public int compareTo(Item item) {
		if (this.process() == item.process()){
			return 0;
		}else if (this.process() < item.process()){
			return -1;
		}else{
			return 1;
		}
	}

	public String toString() {
		return this.name + " [" + this.page + "]";
	}
}
