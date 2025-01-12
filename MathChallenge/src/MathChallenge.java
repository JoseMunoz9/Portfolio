import java.util.Scanner;

// Have the function MathChallenge(num) take the num parameter being passed and return the next number greater than num using the same digits. For example: if num is 123 return 132, if it is 12453 return 12534. If a number has no greater permutations, return -1

// Once the function is working, take the final output string and combine it with the ChallengeToken, both in reverse order and separated by a colon.

// The ChallengeToken: "krofwjc2d".

public class MathChallenge {
	
	class Main {
		
		public static int MathChallenge(int num) {
			// Converting the number to a char array for manipulation:
			char[] digits = String.valueOf(num).toCharArray();
			int n = digits.length;
			
			// Step 1: finding the first digit from the right that is smaller:
			int i = n - 2;
			while (i >= 0 && digits[i] >= digits[i + 1]) {
				i--;
			}
			
			// If not such digit is found, there is no greater permutation:
			if (i < 0) {
				return -1;
			}
			
			// Step 2: finding the smallest digit on the right of 'i' and larger than
			// digits[i]:
			int j = n - 1;
			while (digits[j] <= digits[i]) {
				j--;
			}
			
			// Step 3: Swapping the two digits:
			char temp = digits[i];
			digits[i] = digits[j];
			digits[j] = temp;
			
			// Step 4: reverse the digits to the right of 'i' to get the smallest permutation:
			reverse(digits, i + 1, n - 1);
			
			// Converting back to the integer and return:
			return Integer.parseInt(new String(digits));
		}
		
		// Helper function to reverse a portion of the char array:
		private static void reverse(char[] array, int start, int end) {
			while (start < end) {
				char temp = array[start];
				array[start] = array[end];
				array[end] = temp;
				start++;
				end--;
			}
		}
	// }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		int num = Integer.parseInt(myScanner.nextLine());
		
		int nextNum = MathChallenge(num);
		
		// Step 5: combine the final output with ChallengeToken:
		String challengeToken = "krofwjc2d";
		if (nextNum == -1) {
			System.out.print(new StringBuilder("-1").reverse().toString() + ":" + new StringBuilder(challengeToken).reverse().toString());
		} else {
			System.out.print(new StringBuilder(String.valueOf(nextNum)).reverse().toString() + ":" + new StringBuilder(challengeToken).reverse().toString());
			}
		myScanner.close();

		}

	}
}
