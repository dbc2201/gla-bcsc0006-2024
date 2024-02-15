package stack.reference.recursion;

public class FibonacciTermFinder {
	public int findNthTerm(int n) {
		if (n == 1 || n == 0) {
			return n;
		}
		return findNthTerm(n - 1) + findNthTerm(n - 2);
	}
}
