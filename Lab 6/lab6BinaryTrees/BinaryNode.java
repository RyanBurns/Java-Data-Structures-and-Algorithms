package gmit;

public class BinaryNode{
	private BinaryNode parent;
	private BinaryNode left;
	private BinaryNode right;
	private Item data;
	
	public BinaryNode() {
	}

	public BinaryNode(Item data) {
		super();
		this.data = data;
	}
	
	public BinaryNode(BinaryNode parent) {
		super();
		this.parent = parent;
	}

	public BinaryNode getParent() {
		return parent;
	}

	public void setParent(BinaryNode parent) {
		this.parent = parent;
	}

	public Item getData() {
		return data;
	}

	public void setData(Item data) {
		this.data = data;
	}

	public BinaryNode getLeftSubtree(){
		return this.left;
	}
	
	public void setLeftSubtree(BinaryNode left){
		left.setParent(this);
		this.left = left;
	}

	public BinaryNode getRightSubtree(){
		return this.right;
	}
	
	public void setRightSubtree(BinaryNode right){
		right.setParent(this);
		this.right = right;
	}

	public boolean isRoot(){
		return parent == null;
	}
	
	public boolean isLeaf(){
		return left == null && right == null;
	}
}
