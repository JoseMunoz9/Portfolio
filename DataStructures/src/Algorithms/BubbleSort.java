package Algorithms;
import java.util.Random;

public class BubbleSort {
	// @Author Jose Munoz https://www.linkedin.com/in/jose-munoz90/
	// @Author Jose Munoz https://github.com/JoseMunoz9
	
	
	// Complexity O(n^2)

	public static void main(String[] args) {
		
		Random rand = new Random();
		int[] numbers = new int[10];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(100);
		}
		System.out.println("> Before: ");
		printArray(numbers);
		
		boolean swappedSomething = true;
		
		while (swappedSomething) {
			swappedSomething = false;
			// We are going to sort the algorithm here.
			// The reason why -1 is in the for loop is because when we compare with the one after it,
			// which is the last element of the array, there is no reason
			// to look at the last element, no reason to compare with.
			for (int i = 0; i < numbers.length - 1; i++) {
				// With the IF statement we will check if  'i' is greater than the following number.
				// If it is, that means that they're out of oder and we need to swap them.
				if (numbers[i] > numbers[i + 1]) {
					swappedSomething = true;
					int temp = numbers[i];
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = temp;
				}
			}
		}
		
		System.out.println("> After:");
		printArray(numbers);

	}

	private static void printArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
	}

}
