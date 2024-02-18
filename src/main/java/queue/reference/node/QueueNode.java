package queue.reference.node;

public class QueueNode {
	public int data;
	public QueueNode next;
	
	public QueueNode(int data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "QueueNode{" + "data=" + data + ", next=" + next + '}';
	}
}
