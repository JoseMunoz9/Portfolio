import java.util.Arrays;
import java.util.Scanner;

//@Author Jose Munoz https://www.linkedin.com/in/jose-munoz90/
//@Author Jose Munoz https://github.com/JoseMunoz9

public class SmallestPositive {

	// Write a function that, given an array A of N integers
	// returns the smallest positive integer (greater than 0) that does not occur in A.
	public static int smallestPos(int[] A) {
		// Sorting the Array A
		Arrays.sort(A);
		
		// Declaring integer variable 'smallest'
		int smallest = 1;
		
		// FOR loop
		for(int i = 0; i < A.length; i++) {
			// IF statement, if A at index 'i' is equal to the smallest + integer.
			// smallest increases
			if(A[i] == smallest) {
				smallest++;
			}
		}
		// we return the smallest + integer
		return smallest;
	}
	
	public static void main(String[] args) {
		Scanner mySmallestPositive = new Scanner(System.in);
		String S;
		// int[] A = {};
		
		System.out.println("===============================================");
		System.out.println(" ** WELCOME TO THE SMALLEST POSITIVE INTEGER **");
		System.out.println("===============================================");
		
		System.out.println("\nHere...");
		System.out.println("\t> You will select an Array from the menu below");
		System.out.println("\t> We will return the Smallest Positive Integer (greater than 0)"
				+ " that does not occur in your selected Array");
		System.out.println("\nReady? Great, let us start the game!");
		System.out.println("\n> Please, select an Array now:");
		System.out.println("\t> 1. A = [1, 3, 6, 4, 1, 2]");
		System.out.println("\t> 2. A = [1, 2, 3]");
		System.out.println("\t> 3. A = [-1, -3]");
		S = mySmallestPositive.nextLine();
		
		while(!S.equals("1") && !S.equals("2") && !S.equals("3")) {
			System.out.println("\t ** INVALID INPUT - TRY AGAIN **");
			S = mySmallestPositive.nextLine();
		}
		
		if(S.equals("1")) {
			System.out.println("\t> The Smallest Positive Integer is: " + smallestPos(new int[] {1, 3, 6, 4, 1, 2}));
		} else if(S.equals("2")) {
			System.out.println("\t> The Smallest Positive Integer is: " + smallestPos(new int[] {1, 2, 3}));
		}else if(S.equals("3")) {
			System.out.println("\t> The Smallest Positive Integer is: " + smallestPos(new int[] {-1, -3}));
		}	
		mySmallestPositive.close();
		System.out.println("===========================================");
		System.out.println(" ** THANKS FOR PLAYING - HAVE A GOOD DAY **");
		System.out.println("===========================================");
	}

}
