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
		if (top == array.length - 1) { // check if the stack is already full
			System.err.println("Stack Overflow"); // print error
		}
		top++;
		array[top] = data;
		size++;
	}
	
	@Override
	public int pop() {
		if (isUnderflow()) {
			System.err.println("Stack Underflow");
			return Integer.MIN_VALUE; // return absurd value
		}
		array[top] = 0;
		return array[top--];
	}
	
	@Override
	public int peek() {
		if (isUnderflow()) {
			System.err.println("Stack Underflow");
			return Integer.MIN_VALUE;
		}
		return array[top];
	}
	
	@Override
	public boolean isUnderflow() {
		return top == -1;
	}
	
	@Override
	public int getSize() {
		return size;
	}
}
