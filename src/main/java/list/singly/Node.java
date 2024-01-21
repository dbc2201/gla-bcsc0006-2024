package list.singly;

public class Node {
	private final int data;
	private Node nextNode;
	
	/**
	 * Creates a new node will a 'null' next field.
	 *
	 * @param data the data to be stored in the node.
	 */
	public Node(int data) {
		this.data = data;
	}
	
	public Node(int data, Node nextNode) {
		this.data = data;
		this.nextNode = nextNode;
	}
	
	@Override
	public String toString() {
		return "Node{" + "data=" + data + ", nextNode=" + nextNode + '}';
	}
}
