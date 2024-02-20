package queue.practice.queue;

public class Queue {
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
