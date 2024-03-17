package sorting.bubble;

public class OptimizedBubbleSort {
	public void sort(int[] numbers) {
		boolean isSorted = false;
		for (int counter = 0; counter < numbers.length; counter++) {
			for (int index = 0; index < numbers.length - counter - 1; index++) {
				if (numbers[index] > numbers[index + 1]) {
					isSorted = true;
					int temp = numbers[index + 1];
					numbers[index + 1] = numbers[index];
					numbers[index] = temp;
				}
			}
			if (isSorted) {
				return;
			}
		}
	}
}
