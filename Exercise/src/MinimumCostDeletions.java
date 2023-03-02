import java.util.Scanner;

//@Author Jose Munoz https://www.linkedin.com/in/jose-munoz90/
//@Author Jose Munoz https://github.com/JoseMunoz9

// Given a string S and array C of integers, both of length N, returns the minimum
// cost of all necessary deletions.

public class MinimumCostDeletions {

	public static int minCostDel(String S, int[] C) {
		int minCost = 0;
		for(int i = 1; i < S.length(); i++) {
			
			// IF statement, if the String S at index 'i' is equal to i - 1 AND
			if(S.charAt(i) == S.charAt(i - 1)) {
				
				// If C at index 'i - 1' is less than C at index 'i'
				if(C[i - 1] < C[i]) {
					
					// Then, the variable minCost adds C at index 'i - 1'
					minCost += C[i - 1];
				}
				else {
					// If the statement above does not happen,
					// then the variable minCost adds C at index 'i'
					minCost += C[i];
					C[i] = C[i - 1];
				}
			}
		}
		
		// We'll return the minimum cost:
		return minCost;
	}
	
	public static void main(String[] args) {
		Scanner myDeletions = new Scanner(System.in);
		String S;
		int[] C = {0};
		
		System.out.println("Please enter some letters:");
		S = myDeletions.nextLine();
		
		System.out.println("The minimum cost is: " + minCostDel(S, C));
		myDeletions.close();
		
	}
}
