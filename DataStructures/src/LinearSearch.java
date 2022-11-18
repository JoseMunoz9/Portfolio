import java.util.Scanner;

public class LinearSearch {
	// @Author Jose Munoz https://www.linkedin.com/in/jose-munoz90/
	// @Author Jose Munoz https://github.com/JoseMunoz9

	public static void main(String[] args) {
		// Complexity: O(n)
		// It can be slow for a large data set but fast for small or medium data sets.
		Scanner myLinear = new Scanner (System.in);
				
		// String input2 = Integer.toString(input1); // To convert integer into String.
		int[] array = {25, 28, 26, 27, 30, 29, 31, 33, 32, 34, 36, 35};
		
		System.out.println("*** Welcome to Linear Class ***");
		boolean running = true;
		
		while (running) {
				
			System.out.println("> Select a number from 25 to 36 to know the index"
					+ " in which they have been allocated:");
			int input1 = myLinear.nextInt(); // User's input.
			int index = linearSearch(array, input1); // Declaring the Linear Search function and
			// getting the user's input to search in the array.
			
			// If index is not equal to -1 it means that the value of the user's input does exist
			// in the Array list.
			if (index != -1) {
				System.out.println("\t# Element found at index: " + index);
			}
			else {
				System.out.println("\t# Element not found!");
			}
			System.out.println("> Would you like to try again?");
			System.out.println("\t1. Yes, I'd like to try again.");
			System.out.println("\t2. No, I'd like to close the program.");
			String answer = myLinear.nextLine();
			
			while (!answer.equals("1") && !answer.equals("2")) {
				System.out.println("** You need to select a number from the menu. **");
				answer = myLinear.nextLine();
			}
			if (answer.equals("1")) {
				System.out.println("> Let's try again your luck!");
			} else if (answer.equals("2")) {
				System.out.println("** You have successfully closed the program. **");
				break;
			}
		}
		myLinear.close();
		System.out.println("=====================================");
		System.out.println("** THIS IS HOW LINEAR SEARCH WORKS **");
		System.out.println("=====================================");

	}

	private static int linearSearch(int[] array, int value) {
	// We are going to loop through the array one element at a time, as long as 'i' (index) is equal to 0
	// we will continue this as long as 'i' is less than the array's length that increments 'i' by one.
		for (int i = 0; i < array.length; i++) {
			
	// We are going to check if the array at index 'i' is equal to the value that we are searching for.
			if(array[i] == value) {
				// If it is, then we will return whatever the index is.
				return i;
			}
		}
		return -1;
	}

}
