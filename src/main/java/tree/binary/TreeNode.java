package tree.binary;

public class TreeNode {
	private final int data;
	private final TreeNode leftTreeNode;
	private final TreeNode rightTreeNode;
	
	public TreeNode(int data) {
		this.data = data;
		this.leftTreeNode = null;
		this.rightTreeNode = null;
	}
	
	@Override
	public String toString() {
		return "TreeNode{" + "data=" + data + ", leftTreeNode=" + leftTreeNode + ", rightTreeNode=" + rightTreeNode + '}';
	}
}
