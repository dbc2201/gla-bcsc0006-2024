package tree.binary.search;

import tree.binary.TreeNode;

public class BinarySearchTree {
	public TreeNode rootNode;
	
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
	
	public boolean isLeafNode(TreeNode node) {
		if (node == null) {
			return true;
		}
		return node.leftNode == null && node.rightNode == null;
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
	
	public void traverseTreeInOrder(TreeNode rootNode) {
		if (rootNode != null) {
			traverseTreeInOrder(rootNode.leftNode);
			System.out.println(rootNode.data);
			traverseTreeInOrder(rootNode.rightNode);
		}
	}
	
	public TreeNode findMinimumNode(TreeNode root) {
		if (root == null) {
			return null;
		} else if (isLeafNode(root)) {
			return root;
		} else {
			TreeNode currentNode = rootNode;
			TreeNode parentNode = null;
			while (currentNode != null) {
				parentNode = currentNode;
				currentNode = currentNode.leftNode;
			}
			return parentNode;
		}
	}
	
	public TreeNode findMaximumNode(TreeNode root) {
		if (root == null) {
			return null;
		} else if (isLeafNode(root)) {
			return root;
		} else {
			TreeNode currentNode = rootNode;
			TreeNode parentNode = null;
			while (currentNode != null) {
				parentNode = currentNode;
				currentNode = currentNode.rightNode;
			}
			return parentNode;
		}
	}
	
	private TreeNode getSuccessorNode(TreeNode nodeToBeDeleted) {
		TreeNode successorNodeParent = nodeToBeDeleted;
		TreeNode successorNode = nodeToBeDeleted;
		
		TreeNode currentNode = nodeToBeDeleted.rightNode;
		
		while (currentNode != null) {
			successorNodeParent = successorNode;
			successorNode = currentNode;
			currentNode = currentNode.leftNode;
		}
		
		if (successorNode != nodeToBeDeleted.rightNode) {
			successorNodeParent.leftNode = successorNode.rightNode;
			successorNode.rightNode = nodeToBeDeleted.rightNode;
		}
		return successorNode;
	}
	
	public boolean deleteNode(int key) {
		TreeNode currentNode = this.rootNode;
		TreeNode parentNode = null;
		
		// Find the node to be deleted
		while (currentNode != null && currentNode.data != key) {
			parentNode = currentNode;
			if (key < currentNode.data) {
				currentNode = currentNode.leftNode;
			} else {
				currentNode = currentNode.rightNode;
			}
		}
		
		// If the node is not found, return false
		if (currentNode == null) {
			return false;
		}
		
		// Handle deletion based on node type
		if (isLeafNode(currentNode)) {
			// If it's a leaf node, simply remove the reference from the parent
			if (parentNode == null) {
				this.rootNode = null; // If it's the root node, set root to null
			} else if (parentNode.leftNode == currentNode) {
				parentNode.leftNode = null;
			} else {
				parentNode.rightNode = null;
			}
		} else if (currentNode.leftNode == null) {
			// If only right child, replace the current node with the right child
			if (parentNode == null) {
				this.rootNode = currentNode.rightNode;
			} else if (parentNode.leftNode == currentNode) {
				parentNode.leftNode = currentNode.rightNode;
			} else {
				parentNode.rightNode = currentNode.rightNode;
			}
		} else if (currentNode.rightNode == null) {
			// If only left child, replace the current node with the left child
			if (parentNode == null) {
				this.rootNode = currentNode.leftNode;
			} else if (parentNode.leftNode == currentNode) {
				parentNode.leftNode = currentNode.leftNode;
			} else {
				parentNode.rightNode = currentNode.leftNode;
			}
		} else {
			// If two children, find the in-order successor and replace the current node
			TreeNode successorNode = getSuccessorNode(currentNode);
			int successorKey = successorNode.data;
			deleteNode(successorKey); // Recursively delete the successor node
			currentNode.data = successorKey;
		}
		return true;
	}
}
