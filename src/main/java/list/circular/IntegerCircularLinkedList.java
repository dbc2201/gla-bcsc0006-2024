package list.circular;

import list.doubly.list.IntegerDoublyLinkedList;
import list.doubly.node.DoublyNode;

public class IntegerCircularLinkedList extends IntegerDoublyLinkedList {
	public void makeCircular() {
		if (head != null) {
			tail.next = head;
			head.previous = tail;
		}
	}
	
	@Override
	public void add(int data) {
		super.add(data);
		makeCircular();
	}
	
	@Override
	public int remove(int data) {
		int removed = super.remove(data);
		makeCircular();
		return removed;
	}
	
	@Override
	public void print() {
		DoublyNode currentNode = head;
		while (currentNode != tail) {
			System.out.print(currentNode);
			currentNode = currentNode.next;
		}
	}
	
	@Override
	public DoublyNode search(int data) {
		DoublyNode currentNode = head;
		while (currentNode != tail) {
			if (currentNode.data == data) {
				return currentNode;
			}
			currentNode = currentNode.next;
		}
		return null; // data not found
	}
}
