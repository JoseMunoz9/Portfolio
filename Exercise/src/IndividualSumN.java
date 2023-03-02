import java.util.Scanner;

//@Author Jose Munoz https://www.linkedin.com/in/jose-munoz90/
//@Author Jose Munoz https://github.com/JoseMunoz9

// Given an integer N, return the smallest non-negative integer whose individual digits sum to N.

public class IndividualSumN {

	// Sum of digits - FUNCTION
	static int getSum(int n) {
		int sum = 0;
		while(n != 0) {
			sum = sum + n % 10;
			n = n / 10;
		}
		return sum;
	}
	// With this function we will find the smallest positive number whose sum of its digits is N
	static void smallestNumber(int N) {
		int i = 1;
		while(1 != 0) {
			// Checking if number has sum of digits = N
			if(getSum(i) == N) {
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
		System.out.println("\t> Enter a valid positive integer:");
		N = myInteger.nextInt();
		
		System.out.println("The smallest non-negative int whose individual digits sum to N is:");
		smallestNumber(N);
		
		System.out.println("=====================");
		System.out.println("   HAVE A GOOD DAY   ");
		System.out.println("=====================");
		myInteger.close();
	}

}
