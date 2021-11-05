package gmit;

/*
Post-order Transversal Algorithm
------------------------------------------
	If Tree is Empty Return
	Else
	   Post-order transverse the left subtree
	   Post-order transverse the right subtree
	   Visit the root node

*/
public class PostOrderTransverser implements Visitor{
	public void visit(BinaryNode node){
		if (node == null) return;
		visit(node.getLeftSubtree());
		visit(node.getRightSubtree());
		System.out.println(node.getData());
	}
}
