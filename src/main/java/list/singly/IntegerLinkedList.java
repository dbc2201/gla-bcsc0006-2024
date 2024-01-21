package list.singly;

import list.singly.Node;

public class IntegerLinkedList {
	private Node head;
	private int size;
	
	public IntegerLinkedList() {
		this.head = null;
		this.size = 0;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void addFirst(int data) {
		this.head = new Node(data, this.head);
		size++;
	}
}
