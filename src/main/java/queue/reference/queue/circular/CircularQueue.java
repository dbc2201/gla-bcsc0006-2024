package queue.reference.queue.circular;

import queue.reference.adt.Queue;
import queue.reference.node.QueueNode;

public class CircularQueue implements Queue {
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
	
	@Override
	public void offer(int data) {
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
		size++;
	}
	
	@Override
	public int remove() {
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
	
	@Override
	public int peek() {
		if (isEmpty()) {
			System.err.println("Queue is empty!");
			return Integer.MIN_VALUE;
		}
		return front.data;
	}
}
