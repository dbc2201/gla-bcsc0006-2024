package queue.reference.queue.array;

public class IntegerArrayQueue {
	private final int[] array;
	private int front;
	private int rear;
	private int size;
	
	public IntegerArrayQueue(int capacity) {
		this.array = new int[capacity];
		this.front = 0;
		this.rear = -1;
		this.size = 0;
	}
	
	/**
	 * add `data` at the 'rear' of the queue
	 *
	 * @param data the value to be added
	 */
	public void enqueue(int data) {
		if (size == array.length) {
			System.err.println("Queue is full!");
			return;
		}
		array[++rear] = data;
		size++;
	}
	
	public int dequeue() {
		if (size == 0) {
			rear = -1;
			System.err.println("Queue is empty!");
			return Integer.MIN_VALUE;
		}
		int removed = array[front];
		array[front] = 0;
		front++;
		if (front == array.length) {
			front = 0;
		}
		size--;
		return removed;
	}
	
	public int peekFront() {
		if (size == 0) {
			System.err.println("Queue is empty!");
			return Integer.MIN_VALUE;
		}
		return array[front];
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isFull() {
		return size == array.length;
	}
}
