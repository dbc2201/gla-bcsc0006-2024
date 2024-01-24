package list.singly;

import java.util.Arrays;

public class IntegerArrayLinkedList {
	
	private static final int INITIAL_CAPACITY = 10;
	private int[] integers;
	
	private int size;
	
	private int capacity;
	
	public IntegerArrayLinkedList() {
		this.capacity = INITIAL_CAPACITY;
		this.integers = new int[capacity];
	}
	
	public void reallocate() {
		this.capacity = 2 * capacity;
		this.integers = Arrays.copyOf(integers, capacity);
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int getSize() {
		return size;
	}
	
	public void add(int index, int data) {
		if (index < 0 || index > size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		if (size == capacity) {
			reallocate();
		}
		// shift data in elements from index to size - 1
		for (int counter = size; counter > index; counter--) {
			integers[counter] = integers[counter - 1];
		}
		// insert the new item
		integers[index] = data;
		size++;
	}
	
	public boolean add(int data) {
		if (this.size == capacity) {
			reallocate();
		}
		integers[size] = data;
		size++;
		return true;
	}
	
	public int remove(int index) {
		if (index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		int removedValue = integers[index];
		// shift the elements from index + 1 to size - 1
		for (int counter = index + 1; counter < size; counter++) {
			integers[counter - 1] = integers[counter];
		}
		size--;
		return removedValue;
	}
	
	public int search(int data) {
		int[] copyArray = new int[this.size];
		System.arraycopy(integers, 0, copyArray, 0, size);
		Arrays.sort(copyArray);
		return Arrays.binarySearch(copyArray, data);
	}
	
	public void print() {
		System.out.println(Arrays.toString(this.integers));
	}
}
