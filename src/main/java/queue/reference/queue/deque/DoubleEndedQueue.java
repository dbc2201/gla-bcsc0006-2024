package queue.reference.queue.deque;

import queue.reference.node.QueueNode;

public class DoubleEndedQueue {
	public QueueNode front;
	public QueueNode rear;
	private int size;
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void offerFirst(int data) {
		QueueNode node = new QueueNode(data);
		if (isEmpty()) {
			front = rear = node;
		} else {
			node.next = front;
			front = node;
		}
		size++;
	}
	
	public void offerLast(int data) {
		QueueNode node = new QueueNode(data);
		if (isEmpty()) {
			front = rear = node;
		} else {
			rear.next = node;
			rear = node;
		}
		size++;
	}
	
	public int removeFirst() {
		if (isEmpty()) {
			System.err.println("Queue is empty!");
			return Integer.MIN_VALUE;
		}
		int removed = front.data;
		front = front.next;
		return removed;
	}
	
	public int removeLast() {
		if (isEmpty()) {
			System.err.println("Queue is empty!");
			return Integer.MIN_VALUE;
		}
		int removed = rear.data;
		QueueNode currentNode = front;
		while (currentNode.next != rear) {
			currentNode = currentNode.next;
		}
		currentNode.next = null;
		rear = currentNode;
		return 0;
	}
}
