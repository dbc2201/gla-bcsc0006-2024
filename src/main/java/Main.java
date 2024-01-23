import list.singly.IntegerLinkedList;
import list.singly.Node;

public class Main {
	public static void main(String[] args) {
		IntegerLinkedList list = new IntegerLinkedList();
		list.print();
		list.add(45);
		list.add(46);
		list.add(47);
		list.add(48);
		list.add(49);
		list.print();
		Node searched = list.search(45);
	}
}
