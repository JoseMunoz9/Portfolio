import java.util.Scanner;

// Given a string S containing only characters a and b.
//A substring (contiguous fragment) of S is called a semi-alternating substring if it
// does not contain three identical consecutive characters. In other words, it does not contain
// either 'aaa' or 'bbb' substrings. Note that the whole S is its own substring.

public class SemiAlternatingSubstring {

	public static int solution(String s) {
		// Here we are initializing a constant variable 'MAX_COUNT' to 3, which is the max length
		// of a substring that contains three consecutive identical characters.
		int MAX_COUNT = 3;
		
		// IF statement: if the length of the input string is less than MAX_COUNT, the code returns
		// the length of s.
		if(s.length() < MAX_COUNT) {
			return s.length();
		}
		
		// Here we initialize two integer variables: count and result to 1. These variables keep
		// track of the length of the current semi-alternating substring and the length of the
		// longest semi-alternating substring seen so far.
		// We set them to 1 because the first character of 's' is a semi-alternating substring.
		int count = 1;
		int result = 1;
		
		// The code loops through the characters of 's' from the second character to the second
		// last character. For each character 's.charAt(i)', the code checks if the previous character
		// 's.charAt(i - 1)' and the next character 's.charAt(i + 1)' are both equal to 's.charAt(i)'.
		// If they are equal, then we have a substring of length 3 containing three consecutive
		// identical characters.
		// We then update the 'result' variable to be the maximum of its current value and 'count + 1'
		// and reset 'count' to 1 to start counting a new semi-alternating substring from the current
		// character.
		for(int i = 1; i < s.length() - 1; i++) {
			if(s.charAt(i - 1) == s.charAt(i) && s.charAt(i + 1) == s.charAt(i)) {
				result = Math.max(result, count + 1);
				count = 1;
			}
			// Otherwise, if the current character is part of a semi-alternating substring,
			// we increment 'count' variable.
			else {
				count++;
			}
		}
		// After the loop, the code returns the maximum of 'result' and 'count + 1' variables.
		// This is because the last character of 's' may be part of a semi-alternating substring
		// that was not counted in the loop.
		return Math.max(result, count + 1);
	}
	public static void main(String[] args) {
		Scanner mySemi = new Scanner(System.in);
		String S;
		System.out.println("=============================================");
		System.out.println(" ** WELCOME TO SEMI-ALTERNATING SUBSTRING ** ");
		System.out.println("=============================================");
		boolean running = true;
		// baaabbabbb = 7
		// babba = 5
		// abaaaa = 4
		while (running) {
			System.out.println("\nLet's play:");
			System.out.println("\t> You can type any of the following: "
					+ "baaabbabbb, babba, abaaaa");
			System.out.println("\n\tTry now: ");
			S = mySemi.nextLine();
			System.out.println("\tThe semi-alternate substring is: " + solution(S));
			
			System.out.println("\n\tWHAT WOULD YOU LIKE TO DO NOW?:");
			System.out.println("\t> 1. Try again!");
			System.out.println("\t> 2. Exit the application");
			S = mySemi.nextLine();
			
			while(!S.equals("1") && !S.equals("2")) {
				System.out.println("\n\t** INVALID INPUT - TRY AGAIN **");
				S = mySemi.nextLine();
			}
			
			if(S.equals("1")) {
				System.out.println("\n\tHERE WE GO AGAIN...");
			} else if(S.equals("2")) {
				System.out.println("\n\t** APPLICATION CLOSED **");
				break;
			}
		}
		
		mySemi.close();
		System.out.println("======================");
		System.out.println(" ** HAVE A GOOD DAY **");
		System.out.println("======================");
	}

}
