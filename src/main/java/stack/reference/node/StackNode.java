package stack.reference.node;

public class StackNode {
	public int data;
	public StackNode next;
	
	public StackNode(int data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "StackNode{" + "data=" + data + ", next=" + next + '}';
	}
}
