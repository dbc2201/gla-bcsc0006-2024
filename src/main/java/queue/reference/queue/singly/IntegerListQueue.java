package queue.reference.queue.singly;

import queue.reference.adt.Queue;
import queue.reference.node.QueueNode;

public class IntegerListQueue implements Queue {
	QueueNode front;
	QueueNode rear;
	int size;
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	@Override
	public void offer(int data) {
		QueueNode node = new QueueNode(data);
		if (isEmpty()) {
			front = rear = node;
		} else {
			rear.next = node;
			rear = node;
		}
		size++;
	}
	
	@Override
	public int remove() {
		if (isEmpty()) {
			System.err.println("Queue is Empty!");
			return Integer.MIN_VALUE;
		}
		int removed = front.data;
		front = front.next;
		if (front == null) {
			rear = null;
		}
		size--;
		return removed;
	}
	
	@Override
	public int poll() {
		return 0;
	}
	
	@Override
	public int peek() {
		return 0;
	}
}
