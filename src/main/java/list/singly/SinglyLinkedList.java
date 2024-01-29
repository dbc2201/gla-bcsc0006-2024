package list.singly;

public interface SinglyLinkedList {
	boolean isEmpty();
	
	int getSize();
	
	void add(int data);
	
	int remove(int data);
	
	Node search(int data);
	
	void print();
}
