package tree.binary;

public class TreeNode {
	int data;
	TreeNode leftNode;
	TreeNode rightNode;
	
	public TreeNode(int data) {
		this.data = data;
		this.leftNode = null;
		this.rightNode = null;
	}
	
	@Override
	public String toString() {
		return "TreeNode{" + "data=" + data + ", leftNode=" + leftNode + ", rightNode=" + rightNode + '}';
	}
}
