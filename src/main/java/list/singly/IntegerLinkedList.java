package list.singly;

public class IntegerLinkedList implements SinglyLinkedList {
	private Node head;
	private int size;
	
	public IntegerLinkedList() {
		this.head = null;
		this.size = 0;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int getSize() {
		return size;
	}
	
	public void addFirst(int data) {
		this.head = new Node(data, this.head);
		size++;
	}
	
	public void add(int data) {
		if (this.isEmpty()) {
			this.addFirst(data);
		} else {
			Node currentNode = head;
			while (currentNode.nextNode != null) {
				currentNode = currentNode.nextNode;
			}
			currentNode.nextNode = new Node(data);
			size++;
		}
	}
	
	public int removeFirst() {
		Node currentNode = this.head;
		if (this.head != null) {
			this.head = this.head.nextNode;
		}
		if (currentNode != null) {
			size--;
			return currentNode.data;
		} else return Integer.MIN_VALUE;
	}
	
	public Node search(int data) {
		Node currentNode = head;
		while (currentNode != null) {
			if (currentNode.data == data) {
				return currentNode; // Node with the given data found
			}
			currentNode = currentNode.nextNode;
		}
		return null; // Node with the given data not found
	}
	
	public int remove(int data) {
		if (isEmpty()) {
			return Integer.MIN_VALUE; // List is empty
		}
		
		if (head.data == data) {
			// If the data to be removed is in the head node
			return removeFirst();
		}
		
		Node currentNode = head;
		Node previousNode = null;
		
		// Search for the node with the given data
		while (currentNode != null && currentNode.data != data) {
			previousNode = currentNode;
			currentNode = currentNode.nextNode;
		}
		
		if (currentNode == null) {
			// Node with the given data not found
			return Integer.MIN_VALUE;
		}
		
		// Remove the node with the given data
		previousNode.nextNode = currentNode.nextNode;
		size--;
		
		return currentNode.data;
	}
	
	public void print() {
		if (isEmpty()) {
			System.out.println("[]");
			return;
		}
		System.out.print("[");
		Node currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.data);
			if (currentNode.nextNode != null) {
				System.out.print("=>");
			}
			currentNode = currentNode.nextNode;
		}
		System.out.println("]");
	}
}
