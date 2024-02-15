package stack.reference.recursion;

public class FactorialCalculator {
	public int calculateFactorial(int number) {
		if (number == 0 || number == 1) {
			return 1;
		}
		return number * calculateFactorial(number - 1);
	}
}
