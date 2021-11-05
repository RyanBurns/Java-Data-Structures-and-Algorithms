package gmit;

public class BinaryTreeTest {
	public BinaryTreeTest() {
		BinaryNode root = new BinaryNode(new Person("Tom Riddle", 54));
		init(root);
		
		System.out.println("**** Transversing Binary Tree Using DFS****");
		transverse(root, 0, "root");
		
		System.out.println("\n\n**** Transversing Binary Tree ****");
		Visitor pot = new PreOrderTransverser();
		pot.visit(root);
		
		System.out.println("\n\n**** Binary Search ****");
		Item searchResult = search(root, new Person("Remus Lupin", 60));
		if (searchResult == null){
			System.out.println("No matches found in binary search tree.");
		}else{
			System.out.println("Found match: " + searchResult.process());
		}
		
	}

	/*	
	Recursive Binary Search
	------------------------------------
		If root is Null
		     Item is not in tree. Return Null
		Compare the value of target with root’s data.
		If they are equal
		     Target found. Return root’s data.
		Else if target < root’s data
		     Return result of searching left subtree
		Else
		     Return result of searching right subtree
	*/
	public Item search(BinaryNode node, Item searchItem){
		if (node == null) return null;

		System.out.print("Examining " + ((Person)node.getData()).getName());
		
		int result = searchItem.compareTo(node.getData());
		System.out.println(result);
		if (result == 0){
			System.out.println("Found item...");
			return node.getData();
		}else if (result < 0){
			return search(node.getLeftSubtree(), searchItem);
		}else{
			return search(node.getRightSubtree(), searchItem);
		}
	}
	
	/* Depth-First Transversal of Binary Tree.
	 * -------------------------------------------------
	 * Used for printing out the tree.
	 */
	private void transverse(BinaryNode node, int index, String branch){
		for (int i = 0; i < index; i++) System.out.print("\t");
		System.out.println("[" + branch + "]" + node.getData());
		if (node.getLeftSubtree() != null) transverse(node.getLeftSubtree(), index + 1, "left");
		if (node.getRightSubtree() != null) transverse(node.getRightSubtree(), index + 1, "right");
	}

	/*
	Inserting into a Binary Search Tree
	---------------------------------------------
		If root is Null
		     Replace empty tree with new tree with the item at the root. Return True;
		Else If item equals Roots' data
		     Item already in the tree. Return False;
		Else If item < Root's data
		     Recursively insert item into left subtree
		Else
		     Recursively insert item into right subtree
	*/
	private void insert(BinaryNode localRoot, BinaryNode node){
		if (localRoot == null) { //Replace empty tree with new tree with the item at the root.
			localRoot = node;
			return;
		}
		
		int result = node.getData().compareTo(localRoot.getData());
		if (result == 0){
			return; //Item already in the tree.
		}else if (result < 0){ //Recursively insert item into left subtree
			if (localRoot.getLeftSubtree() == null){
				localRoot.setLeftSubtree(node);
			}else{
				insert(localRoot.getLeftSubtree(), node);
			}
		}else{ //Recursively insert item into right subtree
			if (localRoot.getRightSubtree() == null){
				localRoot.setRightSubtree(node);
			}else{
				insert(localRoot.getRightSubtree(), node);
			}
		}
	}
	
	private void init(BinaryNode root){
		BinaryNode shacklebolt = new BinaryNode(new Person("Kingsley Shacklebolt", 28));
		BinaryNode snape = new BinaryNode(new Person("Severus Snape", 50));
		BinaryNode malfoy = new BinaryNode(new Person("Draco Malfoy", 40));
		BinaryNode trelawney = new BinaryNode(new Person("Cassandra Trelawney", 48));
		BinaryNode lupin = new BinaryNode(new Person("Remus Lupin", 60));
		BinaryNode lestrange = new BinaryNode(new Person("Bellatrix Lestrange", 89));
		BinaryNode hagrid= new BinaryNode(new Person("Rubeus Hagrid", 66));
		BinaryNode black = new BinaryNode(new Person("Sirius Black", 58));
		BinaryNode granger = new BinaryNode(new Person("Hermione Granger", 15));
		
		insert(null, root);
		insert(root, shacklebolt);
		insert(root, snape);
		insert(root, malfoy);
		insert(root, trelawney);
		insert(root, lupin);
		insert(root, lestrange);
		insert(root, hagrid);
		insert(root, black);
		insert(root, granger);
	}
	
	public static void main(String[] args) {
		new BinaryTreeTest();
	}
}
