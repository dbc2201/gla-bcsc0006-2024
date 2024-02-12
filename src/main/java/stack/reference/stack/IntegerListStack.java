package stack.reference.stack;

import stack.reference.adt.Stack;
import stack.reference.node.StackNode;

public class IntegerListStack implements Stack {
	StackNode top;
	int size;
	
	@Override
	public void push(int data) {
		StackNode node = new StackNode(data);
		node.next = this.top;
		this.top = node;
		size++;
	}
	
	@Override
	public int pop() {
		return 0;
	}
	
	@Override
	public int peek() {
		return 0;
	}
	
	@Override
	public boolean isUnderflow() {
		return size == 0;
	}
	
	@Override
	public int getSize() {
		return size;
	}
}
