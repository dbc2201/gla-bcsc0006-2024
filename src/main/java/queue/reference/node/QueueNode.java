package queue.reference.node;

public class QueueNode {
	int data;
	QueueNode next;
	
	public QueueNode(int data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "QueueNode{" + "data=" + data + ", next=" + next + '}';
	}
}
