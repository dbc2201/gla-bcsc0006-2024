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
}
