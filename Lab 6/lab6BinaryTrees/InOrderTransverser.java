package gmit;

/*
In-order Transversal Algorithm
------------------------------------------
If Tree is Empty Return
Else
   In-order transverse the left subtree
   Visit the root node
   In-order transverse the right subtree

*/

public class InOrderTransverser implements Visitor{
	public void visit(BinaryNode node){
		if (node == null) return;
		visit(node.getLeftSubtree());
		System.out.println(node.getData());
		visit(node.getRightSubtree());
	}
}