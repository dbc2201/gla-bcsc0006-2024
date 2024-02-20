package queue.reference.queue.doubly;

public class DoublyQueueNode {
	public int data;
	public DoublyQueueNode next;
	public DoublyQueueNode previous;
	
	public DoublyQueueNode(int data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "DoublyQueueNode{" + "data=" + data + ", next=" + next + ", previous=" + previous + '}';
	}
}
