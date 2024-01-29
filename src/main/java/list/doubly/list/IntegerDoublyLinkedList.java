package list.doubly.list;

import list.doubly.adt.DoublyLinkedList;
import list.doubly.node.DoublyNode;

public class IntegerDoublyLinkedList implements DoublyLinkedList {
	private int size;
	public DoublyNode head;
	public DoublyNode tail;
	
	@Override
	public boolean isEmpty() {
		return size == 0;
	}
	
	@Override
	public int getSize() {
		return this.size;
	}
	
	public void addFirst(int data) {
		DoublyNode node = new DoublyNode(data, head, tail);
		head = node;
		tail = node;
		size++;
	}
	
	@Override
	public void add(int data) {
		if (this.isEmpty()) {
			addFirst(data);
		} else {
			DoublyNode node = new DoublyNode(data, tail, null);
			tail.next = node;
			tail = node;
			size++;
		}
	}
	
	@Override
	public int remove(int data) {
		return 0;
	}
	
	@Override
	public DoublyNode search(int data) {
		return null;
	}
	
	@Override
	public void print() {
	
	}
}
