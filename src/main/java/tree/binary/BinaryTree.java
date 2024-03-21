package tree.binary;

public class BinaryTree {
	private final TreeNode rootNode;
	
	public BinaryTree() {
		this.rootNode = null;
	}
	
	public BinaryTree(TreeNode rootNode) {
		this.rootNode = rootNode;
	}
	
	public BinaryTree(int data, BinaryTree leftTree, BinaryTree rightTree) {
		this.rootNode = new TreeNode(data);
		if (leftTree != null) {
			this.rootNode.leftNode = leftTree.rootNode;
		} else {
			this.rootNode.leftNode = null;
		}
		
		if (rightTree != null) {
			this.rootNode.rightNode = rightTree.rootNode;
		} else {
			this.rootNode.rightNode = null;
		}
	}
	
	public BinaryTree getLeftSubTree() {
		if (this.rootNode != null && this.rootNode.leftNode != null) {
			return new BinaryTree(this.rootNode.leftNode);
		} else return null;
	}
	
	public BinaryTree getRightSubTree() {
		if (this.rootNode != null && this.rootNode.rightNode != null) {
			return new BinaryTree(this.rootNode.rightNode);
		} else return null;
	}
	
	public boolean isLeafNode() {
		if (this.rootNode == null) {
			return true;
		}
		return this.rootNode.leftNode == null && this.rootNode.rightNode == null;
	}
	
	public TreeNode search(int key) {
		TreeNode currentNode = this.rootNode;
		if (currentNode == null) {
			return new TreeNode(Integer.MIN_VALUE);
		}
		while (currentNode.data != key) {
			if (key < currentNode.data) {
				currentNode = currentNode.leftNode;
			} else {
				currentNode = currentNode.rightNode;
			}
			
			if (currentNode == null) {
				return new TreeNode(Integer.MIN_VALUE);
			}
		}
		return currentNode;
	}
}
