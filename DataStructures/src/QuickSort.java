import java.util.Random;

public class QuickSort {
	
	//@Author Jose Munoz https://www.linkedin.com/in/jose-munoz90/
	// @Author Jose Munoz https://github.com/JoseMunoz9
	
	// QuickSort is a recursive algorithm.
	// It is supposed to be the fastest algorithm.
	// Complexity: O(n*log(n)).

	public static void main(String[] args) {
		Random rand = new Random();
		// Array size of 10 which will generate integers between 0 and 100, randomly.
		int[] numbers1 = new int[10];
		
		for (int i = 0; i < numbers1.length; i++) {
			numbers1[i] = rand.nextInt(100);
		}
		
		// Here we will print the array of integers in random order:
		System.out.println("Random order of the Array: ");
		printArray(numbers1);
		
		// QuickSort method, here we will sort the array from the smallest to the largest.
		quicksort(numbers1);
		
		// Once it is sorted, we will print again the array in the right order.
		System.out.println("\nArray in the correct(right) order: ");
		printArray(numbers1);
		
		System.out.println("============================================");
		System.out.println("** THIS IS HOW QUICK SORT ALGORITHM WORKS **");
		System.out.println("============================================");
	}

	private static void quicksort(int[] array) {
		// QuickSort method, here we will sort the array from the smallest to the largest.
		quicksort(array, 0, array.length - 1);
		
	}

	private static void quicksort(int[] array, int lowIndex, int highIndex) {
		
		if (lowIndex >= highIndex) {
			return;
		}
		
		int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
		int pivot = array[pivotIndex];
		swap(array, pivotIndex, highIndex);
		
		int leftPointer = partition(array, lowIndex, highIndex, pivot);
		
		// Recursively quick sorting the left and right partition.
		quicksort(array, lowIndex, leftPointer - 1);
		quicksort(array, leftPointer + 1, highIndex);
	}

	private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
		int leftPointer = lowIndex;
		int rightPointer = highIndex - 1;
		
		// While loop that will move the 'left index' and the 'right index' towards each other
		// until they are in the same spot.
		while (leftPointer < rightPointer) {
			// Inner loop, we go from the left to the right
			// until we find a number greater than the pivot.
			while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
				// If the condition in the inner while loop is met, then we increment 'left pointer'.
				leftPointer++;
			}
			// Another inner loop. We are moving the right pointer to the left.
			// until we find a number less than the pivot.
			while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
				// If the condition in this loop is met, we decrement it.
				rightPointer--;
			}
			swap(array, leftPointer, rightPointer);
		}
		if (array[leftPointer] > array[highIndex]) {
			swap(array, leftPointer, highIndex);
			}
		else {
			leftPointer = highIndex;
		}
		return leftPointer;
	}
	
	private static void swap(int[] array, int index1, int index2) {
		// Creating a temporary variable to hold the value we want to swap.
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

	private static void printArray(int[] numbers1) {
		for (int i = 0; i < numbers1.length; i++) {
			System.out.println(numbers1[i]);
		}
		
	}

}
