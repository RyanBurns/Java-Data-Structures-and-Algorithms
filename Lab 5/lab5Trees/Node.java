package gmit;

import java.util.*;
public class Node {
	private Node parent;
	private Item item;
	private List<Node> children = new ArrayList<Node>();
	
	public Node(){
	}
	
	public Node(Node parent){
		this.parent = parent;
	}
	
	public Node(Item item){
		this.item = item;
	}
	
	public Node(Node parent, Item item){
		this(parent);
		this.item = item;
	}
	
	public boolean isRoot(){
		return this.parent == null;
	}
	
	public boolean hasChildren(){
		return this.children.size() > 0;
	}
	
	public void addChild(Node child){
		child.setParent(this);
		children.add(child);
	}
	
	public void removeChild(Node child){
		children.remove(child);
	}
	
	public Node getParent(){
		return this.parent;
	}
	
	public void setParent(Node parent){
		this.parent = parent;
	}
	
	public Node[] children(){
		return (Node[]) children.toArray(new Node[children.size()]);
	}
	
	public void setItem(Item item){
		this.item = item;
	}
	
	public Item getItem(){
		return this.item;
	}
}
