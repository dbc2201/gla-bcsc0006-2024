package list.doubly.list;

import list.doubly.adt.DoublyLinkedList;
import list.doubly.node.DoublyNode;

public class IntegerDoublyLinkedList implements DoublyLinkedList {
	public DoublyNode head;
	public DoublyNode tail;
	public int size;
	
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
	
	public int removeFirst() {
		int removedData = head.data;
		if (head == tail) { // there is only one node in the list
			head = null;
			tail = null;
		} else {
			head = head.next;
			head.previous = null;
		}
		size--;
		return removedData;
	}
	
	@Override
	public int remove(int data) {
		if (isEmpty()) {
			// if there is no node in the list, return -214748364
			return Integer.MIN_VALUE;
		}
		
		DoublyNode current = head;
		
		while (current != null && current.data != data) {
			current = current.next;
		}
		
		if (current == null) {
			return Integer.MAX_VALUE; // Data not found
		}
		
		if (current == head) {
			return removeFirst(); // Use removeFirst() for the head node
		}
		
		current.previous.next = current.next;
		
		if (current == tail) { // If removing the tail
			tail = current.previous;
		} else {
			current.next.previous = current.previous;
		}
		
		size--;
		return current.data;
	}
	
	@Override
	public DoublyNode search(int data) {
		DoublyNode currentNode = head;
		while (currentNode != null) {
			if (currentNode.data == data) {
				return currentNode;
			}
			currentNode = currentNode.next;
		}
		return null; // data not found
	}
	
	@Override
	public void print() {
		DoublyNode currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode);
			currentNode = currentNode.next;
		}
	}
}
