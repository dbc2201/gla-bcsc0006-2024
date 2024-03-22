package tree.binary;

public class TreeNode {
	public int data;
	public TreeNode leftNode;
	public TreeNode rightNode;
	
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
