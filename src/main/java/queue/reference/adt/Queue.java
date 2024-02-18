package queue.reference.adt;

public interface Queue {
	void offer(int data);
	
	int remove();
	
	int peek();
}
