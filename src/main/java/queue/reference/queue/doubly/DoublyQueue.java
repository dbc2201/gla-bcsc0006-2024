package queue.reference.queue.doubly;

public class DoublyQueue {
	public DoublyQueueNode front;
	public DoublyQueueNode rear;
	int size;
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void enqueue(int data) {
		DoublyQueueNode node = new DoublyQueueNode(data);
		if (isEmpty()) {
			front = rear = node;
		} else {
			rear.next = node;
			node.previous = rear;
			rear = node;
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
			return removed;
		}
		front = front.next;
		front.previous = null;
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
