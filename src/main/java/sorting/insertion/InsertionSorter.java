package sorting.insertion;

public class InsertionSorter {
	public void sort(int[] numbers) {
		for (int index = 0; index < numbers.length; index++) {
			int currentElement = numbers[index];
			int comparingIndex = index - 1;
			while (comparingIndex >= 0 && numbers[comparingIndex] > currentElement) {
				numbers[comparingIndex + 1] = numbers[comparingIndex];
				comparingIndex--;
			}
			numbers[comparingIndex + 1] = currentElement;
		}
	}
}
