package list.doubly.node;

public class DoublyNode {
	public int data;
	public DoublyNode previous;
	public DoublyNode next;
	
	public DoublyNode(int data) {
		this.data = data;
	}
	
	public DoublyNode(int data, DoublyNode previous, DoublyNode next) {
		this.data = data;
		this.previous = previous;
		this.next = next;
	}
	
	@Override
	public String toString() {
		return "{"
				+ (previous == null ? "null" : previous.data)
				+ " <--> " + this.data + " <--> "
				+ (next == null ? "null" : next.data)
				+ "}";
	}
}
