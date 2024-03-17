package sorting.selection;

public class SelectionSorter {
	public void sort(int[] numbers) {
		// repeat (numOfElements - 1) times
		for (int swapIndex = 0; swapIndex < numbers.length - 1; swapIndex++) {
			// set the first unsorted element as the minimum
			int minimumIndex = swapIndex;
			// find the index of the minimum element in the unsorted portion
			for (int index = swapIndex + 1; index < numbers.length; index++) {
				// if element < current minimum
				if (numbers[index] < numbers[minimumIndex]) {
					// update the index of the minimum element
					minimumIndex = index;
				}
			}
			// swap the minimum element with the first unsorted position
			int temp = numbers[swapIndex];
			numbers[swapIndex] = numbers[minimumIndex];
			numbers[minimumIndex] = temp;
		}
	}
}
