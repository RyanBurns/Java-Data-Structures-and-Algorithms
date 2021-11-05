package gmit;

/*
Pre-order Transversal Algorithm
------------------------------------------
	If Tree is Empty Return
	Else
	   Visit the root node
	   Pre-order transverse the left subtree
	   Pre-order transverse the right subtree
*/
public class PreOrderTransverser implements Visitor{
	public void visit(BinaryNode node){
		if (node == null) return;
		
		System.out.println(node.getData());
		visit(node.getLeftSubtree());
		visit(node.getRightSubtree());
	}
}
