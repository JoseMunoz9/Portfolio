import java.util.Arrays;

public class SmallestPositive {

	// Write a function that, given an array A of N integers
	// returns the smallest positive integer (greater than 0) that does not occur in A.
	public int smallestPos(int[] A) {
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

}
