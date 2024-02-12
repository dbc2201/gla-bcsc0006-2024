package stack.reference.stack;

import stack.reference.adt.Stack;

public class IntegerArrayStack implements Stack {
	private final int[] array;
	int top;
	int size;
	
	public IntegerArrayStack(int capacity) {
		this.array = new int[capacity];
		this.top = -1;
		this.size = 0;
	}
	
	@Override
	public void push(int data) {
	
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
		return false;
	}
	
	@Override
	public int getSize() {
		return 0;
	}
}
