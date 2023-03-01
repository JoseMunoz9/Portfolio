// Given a two-digit integer 'n', return the sum of its digits.


public class SumOfTwo {

	int solution(int n) {
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

}
