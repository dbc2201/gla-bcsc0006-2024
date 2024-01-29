package list.doubly.adt;

import list.doubly.node.DoublyNode;

public interface DoublyLinkedList {
	boolean isEmpty();
	int getSize();
	
	void add(int data);
	
	int remove(int data);
	
	DoublyNode search(int data);
	
	void print();
}
