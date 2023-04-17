import java.util.Scanner;
// Given a two-digit integer 'n', return the sum of its digits.


public class SumOfTwo {

	public static int solution(int n) {
		// Declaring the variables:
		String result = String.valueOf(n);
		int[] digits = new int [result.length()];
		
		// 'for-loop' to iterate through the given integers.
		for(int i = 0; i < result.length(); i++) {
			digits[i] = Character.getNumericValue(result.charAt(i));
		}
		
		// Here we return the result for the addition of the 2 digit integer.
		return digits[0] + digits[1];
	}
	
	public static void main(String[] args) {
		int n;
		Scanner mySum = new Scanner(System.in);
		
		System.out.println("===============================================");
		System.out.println(" ** WELCOME TO THE SUM OF TWO-DIGITS INTEGER **");
		System.out.println("===============================================");
		
		System.out.println("Here...");
		System.out.println("\t> You will enter a TWO-DIGITS integer (N)");
		System.out.println("\t> We will return the sum its digits.");
		System.out.println();
		System.out.println("Ready? Good, let's start..");
		System.out.println("\t> Enter a TWO-DIGITS integer:");
		n = mySum.nextInt();
		
		System.out.println("The sum of " + n + " is: " + solution(n));
		
		mySum.close();
		System.out.println("===========================================");
		System.out.println(" ** THANKS FOR PLAYING - HAVE A GOOD DAY **");
		System.out.println("===========================================");
	}

}
