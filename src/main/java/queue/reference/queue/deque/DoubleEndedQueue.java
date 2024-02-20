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
}
