package tree.binary.avl;

import tree.binary.TreeNode;
import tree.binary.search.BinarySearchTree;

public class AVLTree extends BinarySearchTree {
	
	public boolean rotateRight(TreeNode root) {
		if (root == null) {
			return false;
		} else {
			TreeNode temp = root.leftNode;
			root.leftNode = temp.rightNode;
			temp.rightNode = root;
			rootNode = temp;
			return true;
		}
	}
	
	public boolean rotateLeft(TreeNode root) {
		if (root == null) {
			return false;
		} else {
			TreeNode temp = root.rightNode;
			root.rightNode = temp.leftNode;
			temp.leftNode = root;
			rootNode = temp;
			return true;
		}
	}
}
