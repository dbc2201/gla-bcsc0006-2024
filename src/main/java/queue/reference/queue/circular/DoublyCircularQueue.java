package queue.reference.queue.circular;

import queue.reference.queue.doubly.DoublyQueueNode;

public class DoublyCircularQueue {
	DoublyQueueNode front;
	DoublyQueueNode rear;
	int size;
	int capacity;
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean isFull() {
		return size == capacity;
	}
	
	public DoublyCircularQueue(int capacity) {
		if (capacity <= 0) {
			System.err.println("Capacity must be positive!");
		}
		this.capacity = capacity;
		size = 0;
	}
	
	public void enqueue(int data) {
		if (isFull()) {
			System.err.println("Queue is full!");
		}
		DoublyQueueNode node = new DoublyQueueNode(data);
		if (isEmpty()) {
			front = rear = node;
			node.next = node;
			node.previous = node;
		} else {
			rear.next = node;
			node.previous = rear;
			rear = node;
			rear.next = front;
			front.previous = rear;
		}
		size++;
	}
	
	public int dequeue() {
		if (isEmpty()) {
			System.err.println("Queue is empty!");
			return Integer.MIN_VALUE;
		}
		int removed = front.data;
		if (front == rear) {
			front = rear = null;
		} else {
			front = front.next;
			front.previous = rear;
			rear.next = front;
		}
		size--;
		return removed;
	}
	
	public int peek() {
		if (isEmpty()) {
			System.err.println("Queue is empty!");
			return Integer.MIN_VALUE;
		}
		return front.data;
	}
}
