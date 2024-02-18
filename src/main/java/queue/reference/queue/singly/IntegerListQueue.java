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
	
	}
	
	@Override
	public int remove() {
		return 0;
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
