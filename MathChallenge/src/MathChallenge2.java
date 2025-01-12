import java.util.Scanner;

// Have the function MathChallenge(num) take the num parameter being passed and return the next number greater than num using the same digits. For example: if num is 123 return 132, if it is 12453 return 12534. If a number has no greater permutations, return -1

// Once the function is working, take the final output string and remove any characters (case sensitive) from it that appears in the ChallengeToken, If the new final string is empty, return the string EMPTY.

// The ChallengeToken: "rqc8u56k7".

public class MathChallenge2 {
	
	class Main {
		
		public static int MathChallenge(int num) {
			// Step 1: finding the next permutation:
			String numStr = Integer.toString(num);
			char[] numArray = numStr.toCharArray();
			
			// Finding the rightmost ascent in the array:
			int i = numArray.length - 2;
			while (i >= 0 && numArray[i] >= numArray[i + 1]) {
				i--;
			}
			
			if (i == -1) {
				return -1; // No next permutation exists.
			}
			
			// Finding the smallest digit greater than numArray[i] to the right:
			int j = numArray.length - 1;
			while (numArray[j] <= numArray[i]) {
				j--;
			}
			
			// Swapping the two digits:
			char temp = numArray[i];
			numArray[i] = numArray[j];
			numArray[j] = temp;
			
			// Reverse the substring after position i:
			reverse(numArray, i + 1, numArray.length - 1);
			
			// Step 2: remove characters from ChallengeToken:
			String result = new String(numArray);
			String challengeToken = "rqc8u56k7";
			for (int k = 0; k < challengeToken.length(); k++) {
				result = result.replace(String.valueOf(challengeToken.charAt(k)), "");
			}
			
			// If the string becomes empty, return "EMPTY" as an integer -1:
			if (result.isEmpty()) {
				return -1; // Treating "EMPTY" as -1 for the return type of integer.
			}
			
			// Try converting the result to an integer, if it can be parsed:
			try {
				return Integer.parseInt(result); // convert result to integer and return.
			} catch (NumberFormatException e) {
				return -1; // If conversion fails, return -1.
			}
		}
		
		// Helper method to reverse the array:
		public static void reverse(char[] arr, int start, int end) {
			while (start < end) {
				char temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		}
	// }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		System.out.print(MathChallenge(Integer.parseInt(myScanner.nextLine())));
		
		myScanner.close();

		}

	}
	
}
