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
	// Main code:
	public static void main(String[] args) {
		Scanner myDeletions = new Scanner(System.in);
		String S;
		int[] C = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println("========================================");
		System.out.println("  WELCOME TO THE MINIMUM COST DELETIONS ");
		System.out.println("========================================");
		
		System.out.println("\nHere...");
		System.out.println("\t> You will enter repetitive letters");
		System.out.println("\t> We will return the minimum cost of all necessary deletions");
		System.out.println("\nReady? Great, let us start the game!");
		
		boolean running = true;
		while(running) {
			System.out.println("\t> Enter repetitive letters now:");
			S = myDeletions.nextLine();
			
		//	System.out.println("The minimum cost is: " + minCostDel(S, new int[] {10, 5, 10, 5, 10}));
			System.out.println("\nYou have entered: " + S);
			System.out.println("\t> The Minimum Cost Deletion is: " + minCostDel(S, C));
			
			
			System.out.println("\nWHAT WOULD YOU LIKE TO DO NOW?");
			System.out.println("\t> 1. I'd like to try again");
			System.out.println("\t> 2. I'd like to close the application");
			String menu = myDeletions.nextLine();
			
			while(!menu.equals("1") && !menu.equals("2")) {
				System.out.println("\t** INVALID INPUT - TRY AGAIN **");
				menu = myDeletions.nextLine();
			}
			
			if(menu.equals("1")) {
				System.out.println("Here we go again...");
				System.out.println("====================================");
			} else if(menu.equals("2")) {
				System.out.println("\t** APPLICATION CLOSED **");
				break;
			}
		}
		
		// Closing my scanner
		myDeletions.close();
		System.out.println("===========================================");
		System.out.println(" ** THANKS FOR PLAYING - HAVE A GOOD DAY **");
		System.out.println("===========================================");
		
	}
}
