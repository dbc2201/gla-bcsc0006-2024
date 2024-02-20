package queue.reference.queue.circular;

import queue.reference.node.QueueNode;

public class CircularQueue {
	QueueNode front;
	QueueNode rear;
	int size;
	int capacity;
	
	public CircularQueue(int capacity) {
		if (capacity <= 0) {
			System.err.println("Capacity must be positive!");
		}
		this.capacity = capacity;
		this.size = 0;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean isFull() {
		return size == capacity;
	}
	
	public void offerFirst(int data) {
		if (isFull()) {
			System.err.println("Queue is full!");
			return;
		}
		QueueNode node = new QueueNode(data);
		if (isEmpty()) {
			front = rear = node;
			node.next = node;
		} else {
			node.next = front;
			front = node;
			rear.next = front;
		}
		size++;
	}
	
	public void offerLast(int data) {
		if (isFull()) {
			System.err.println("Queue is full!");
			return;
		}
		QueueNode node = new QueueNode(data);
		if (isEmpty()) {
			front = rear = node;
			node.next = node;
		} else {
			rear.next = node;
			rear = node;
			rear.next = front;
		}
	}
	
	public int removeFirst() {
		if (isEmpty()) {
			System.err.println("Queue is empty!");
			return Integer.MIN_VALUE;
		}
		int removed = front.data;
		if (front == rear) {
			front = rear = null;
		} else {
			front = front.next;
			rear.next = front;
		}
		size--;
		return removed;
	}
	
	public int removeLast() {
		if (isEmpty()) {
			System.err.println("Queue is empty!");
			return Integer.MIN_VALUE;
		}
		int removed = rear.data;
		if (front == rear) {
			front = rear = null;
		} else {
			QueueNode currentNode = front;
			while (currentNode.next != rear) {
				currentNode = currentNode.next;
			}
			currentNode.next = null;
			rear = currentNode;
			rear.next = front;
		}
		size--;
		return removed;
	}
	
	public int peekFirst() {
		return 0;
	}
	
	public int peekLast() {
		return 0;
	}
}
