package queue.practice.queue;

public class Queue {
	Node front;
	Node rear;
	int size;
	
	public int getSize() {
		return Integer.MIN_VALUE;
	}
	
	public boolean isEmpty() {
		return false;
	}
	
	public void enqueue(int data) {
		return;
	}
	
	public int dequeue() {
		return Integer.MIN_VALUE;
	}
	
	public int peek() {
		return Integer.MIN_VALUE;
	}
	
	static class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
		
		@Override
		public String toString() {
			return "Node{" + "data=" + data + ", next=" + next + '}';
		}
	}
}
