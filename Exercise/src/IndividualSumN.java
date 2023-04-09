import java.util.Scanner;

//@Author Jose Munoz https://www.linkedin.com/in/jose-munoz90/
//@Author Jose Munoz https://github.com/JoseMunoz9

// Given an integer N, return the smallest non-negative integer whose individual digits sum to N.

public class IndividualSumN {
	// Sum of digits - FUNCTION
	static int getSum(int n) {
		// Declaring integer 'sum' as '0'
		int sum = 0;
		
		// While-Loop that will execute this statement while the condition is true
		while(n != 0) {
			// Sum will be the result of sum plus 'n' modulus of 10
			sum = sum + n % 10;
			n = n / 10;
		}
		return sum;
	}
	// With this function we will find the smallest positive number whose sum of its digits is N
	static void smallestNumber(int N) {
		// Declaring integer 'i' as 1 (smallest positive integer).
		int i = 1;
		
		while(1 != 0) {
			// Checking if number has sum of digits = N
			// Calling the function 'getSum' at index 'i'
			if(getSum(i) == N) {
				
				// Printing the Smallest Positive number
				System.out.println(i);
				break;
			}
			i++;
		}
	}
	// Main code
	public static void main(String[] args) {
		int N;
		Scanner myInteger = new Scanner(System.in);
		
		System.out.println("==============================");
		System.out.println("  Welcome to the Coding Game  ");
		System.out.println("==============================");
		
		System.out.println("Here...");
		System.out.println("\t> You will enter a positive integer number (N)");
		System.out.println("\t> We will return the smallest positive integer whose individual digits sum to your input.");
		System.out.println();
		System.out.println("Ready? Good, let's start..");
		
		boolean running = true;
		while(running) {
			System.out.println("\t> Enter a valid positive integer:");
			N = myInteger.nextInt();
					
			System.out.println("The smallest non-negative int whose individual digits sum to N is:");
			smallestNumber(N);
			
			System.out.println("\nWHAT WOULD YOU LIKE TO DO NOW?");
			System.out.println("\t> 1. Try again!");
			System.out.println("\t> 2. Close the application");
			String menu = myInteger.nextLine();
			
			while(!menu.equals("1") && !menu.equals("2")) {
				System.out.println("\t** INVALID INPUT - TRY AGAIN **");
				menu = myInteger.nextLine();
			}
			if(menu.equals("1")) {
				System.out.println("Here we go again...");
			} else if(menu.equals("2")) {
				System.out.println("\t** APPLICATION CLOSED **");
				break;
			}
		}
			
		myInteger.close();
		System.out.println("=====================");
		System.out.println("   HAVE A GOOD DAY   ");
		System.out.println("=====================");
	}
}
