package list.practice.doubly;

public class DoublyLinkedList {
	Node head;
	Node tail;
	int size;
	
	static class Node {
		int data;
		Node next;
		Node previous;
		
		public Node(int data) {
			this.data = data;
		}
	}
}
