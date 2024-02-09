package list.reference.doubly.adt;

import list.reference.doubly.node.DoublyNode;

public interface DoublyLinkedList {
	boolean isEmpty();
	int getSize();
	
	void add(int data);
	
	int remove(int data);
	
	DoublyNode search(int data);
	
	void print();
}
