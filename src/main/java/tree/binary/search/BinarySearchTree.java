package tree.binary.search;

import tree.binary.TreeNode;

public class BinarySearchTree {
	private TreeNode rootNode;
	
	public BinarySearchTree() {
		this.rootNode = null;
	}
	
	public BinarySearchTree(TreeNode rootNode) {
		this.rootNode = rootNode;
	}
	
	public BinarySearchTree(int data, BinarySearchTree leftTree, BinarySearchTree rightTree) {
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
	
	public BinarySearchTree getLeftSubTree() {
		if (this.rootNode != null && this.rootNode.leftNode != null) {
			return new BinarySearchTree(this.rootNode.leftNode);
		} else return null;
	}
	
	public BinarySearchTree getRightSubTree() {
		if (this.rootNode != null && this.rootNode.rightNode != null) {
			return new BinarySearchTree(this.rootNode.rightNode);
		} else return null;
	}
	
	public boolean isLeafNode() {
		if (this.rootNode == null) {
			return true;
		}
		return this.rootNode.leftNode == null && this.rootNode.rightNode == null;
	}
	
	public void insertNode(int data) {
		TreeNode node = new TreeNode(data);
		
		if (this.rootNode == null) { // if there is no node in the binary tree
			this.rootNode = node;    // make the new node the root node
		} else {
			TreeNode currentNode = this.rootNode;
			TreeNode parentNode;
			
			while (true) {
				parentNode = currentNode;
				if (data < currentNode.data) {
					currentNode = currentNode.leftNode;
					if (currentNode == null) {
						parentNode.leftNode = node;
						return;
					}
				} else {
					currentNode = currentNode.rightNode;
					if (currentNode == null) {
						parentNode.rightNode = node;
						return;
					}
				}
			}
		}
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
