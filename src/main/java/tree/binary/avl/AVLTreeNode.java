package tree.binary.avl;

public class AVLTreeNode {
	public int data;
	public AVLTreeNode leftNode;
	public AVLTreeNode rightNode;
	public int height;
	
	public AVLTreeNode(int data) {
		this.data = data;
		this.leftNode = null;
		this.rightNode = null;
		this.height = 0;
	}
	
	@Override
	public String toString() {
		return "AVLTreeNode{" + "data=" + data + ", leftNode=" + leftNode + ", rightNode=" + rightNode + ", height=" + height + '}';
	}
}
