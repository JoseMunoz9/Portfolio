import java.util.Random;

public class MergeSort {
	// @Author Jose Munoz https://www.linkedin.com/in/jose-munoz90/
	// @Author Jose Munoz https://github.com/JoseMunoz9

	public static void main(String[] args) {
		
		// Complexity: O(nLogn).
		// This is a recursive algorithm.
		
		Random rand = new Random();
		int[] numbers3 = new int[100];
		
		for (int i = 0; i < numbers3.length; i++) {
			// This will give us the unsorted Array we want to sort.
			numbers3[i] = rand.nextInt(1000000);
		}
		// First, we print the unordered (not sorted) Array.
		System.out.println("** Random order **");
		printArray(numbers3);
		
		// Method that we are going to use to sort the Array List.
		mergeSort(numbers3);
		
		// We print again the Array list, but this time in the correct order.
		System.out.println("\n** Sorted Array List **");
		printArray(numbers3);

	}

	private static void mergeSort(int[] inputArray1) {
		int inputLength = inputArray1.length;
		
		if (inputLength < 2) {
			return;
		}
		
		// Here we are dividing our Array List in half.
		int midIndex = inputLength / 2;
		int[] leftHalf = new int[midIndex];
		int[] rightHalf = new int[inputLength - midIndex];
		
		// Left half of the Array List.
		for (int i = 0; i < midIndex; i++) {
			leftHalf[i] = inputArray1[i];
		}
		// Right half of the Array List.
		for (int i = midIndex; i < inputLength; i++) {
			rightHalf[i - midIndex] = inputArray1[i];
		}
		
		// Here we are going to merge each half of the Array List.
		mergeSort(leftHalf);
		mergeSort(rightHalf);
		
		merge(inputArray1, leftHalf, rightHalf);
		
		
	}
	
	private static void merge (int[] inputArray1, int[] leftHalf, int[] rightHalf) {
		int leftSize = leftHalf.length;
		int rightSize = rightHalf.length;
		
		// 'i' is the iterator for the left half.
		// 'j' is the iterator for the right half.
		// 'k' is the iterator for our merged Array.
		int i = 0, j = 0, k = 0;
		
		while (i < leftSize && j < rightSize) {
			// Here we are going to compare left and right half.
			if (leftHalf[i] <= rightHalf[j]) {
				inputArray1[k] = leftHalf[i];
				// Here we are incrementing 'i' to have a look at the next element of the left half the Array.
				i++;
			}
			else {
				inputArray1[k] = rightHalf[j];
				j++;
			}
			k++;
		}
		while (i < leftSize) {
			inputArray1[k] = leftHalf[i];
			i++;
			k++;
		}
		while (j < rightSize) {
			inputArray1[k] = rightHalf[j];
			j++;
			k++;
		}
	}

	private static void printArray(int[] numbers3) {
		for (int i = 0; i < numbers3.length; i++) {
			System.out.println(numbers3[i]);
		}
		
	}

}
