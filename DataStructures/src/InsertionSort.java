import java.util.Random;
import java.util.Scanner;

// @Author Jose Munoz https://www.linkedin.com/in/jose-munoz90/
// @Author Jose Munoz https://github.com/JoseMunoz9

public class InsertionSort {
	
	// Complexity: O(n^2)

	public static void main(String[] args) {
		Scanner myInsertion = new Scanner(System.in);
		Random rand =new Random();
		int[] numbers2 = new int[10];
		
		for (int i = 0; i < numbers2.length; i++) {
			numbers2[i] = rand.nextInt(100);
		}
		boolean insertion = true;
		while (insertion) {
		
		// We print here the unsorted Array.
		System.out.println("Unsorted 'Array List': ");
		printArray(numbers2);
		
		// Here we sort the Array.
		insertionSort(numbers2);
		
		// We print again the Array list but this time in the correct order(sorted).
		System.out.println("\nSorted 'Array List': ");
		printArray(numbers2);
		
		System.out.println("Would you like to try again?");
		System.out.println("\t1. Yes, let's try again!");
		System.out.println("\t2. No, I'd like to close this program.");
		
		String insert = myInsertion.nextLine();
		
		while (!insert.equals("1") && !insert.equals("2")) {
			System.out.println("** You need to select a number from the options above. Try again! **");
			insert = myInsertion.nextLine();
		}
		if (insert.equals("1")) {
			System.out.println("OK, here you are: ");
		}
		else if (insert.equals("2")) {
			System.out.println("** You have successfully closed the program. **");
			break;
			}
		}
		
		myInsertion.close();
		System.out.println("================================================");
		System.out.println("** THIS IS HOW INSERTION SORT ALGORITHM WORKS **");
		System.out.println("================================================");

	}

	private static void insertionSort(int[] inputArray) {
		// Here we are going to walk through the Array.
		// We are going to start at index 1.
		for (int i = 1; i < inputArray.length; i++) {
			int currentValue = inputArray[i];
			
			// Here we are going to walk back towards the beginning of the Array.
			int j = i - 1;
			while (j >= 0 && inputArray[j] > currentValue) {
				inputArray[j + 1] = inputArray[j];
				// In order to keep moving towards the beginning of the Array we decrement 'j' by one.
				j--;
			}
			inputArray[j + 1] = currentValue;
		}
		
	}
    // 'PrintArray' method to print the unsorted and sorted Array List respectively.
	private static void printArray(int[] numbers2) {
		for (int i = 0; i < numbers2.length; i++) {
			System.out.println(numbers2[i]);
		}
		
	}

}
