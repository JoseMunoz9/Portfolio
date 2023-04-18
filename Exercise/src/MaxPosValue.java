import java.util.Scanner;
// @Author Jose Munoz https://www.linkedin.com/in/jose-munoz90/
// @Author Jose Munoz https://github.com/JoseMunoz9

public class MaxPosValue {

	public static int solution(int X) {
		String stringX = Integer.toString(X); // With this line of code we convert integer to string
		
		// Calculating the length of the variable 'stringX' and we assign it to the variable 'length'
		int length = stringX.length();
		
		// Assigning variable 'maxValue' with the minimum possible integer value.
		int maxValue = Integer.MIN_VALUE;
		
		// FOR loop that iterates through each character in the string 'stringX'
		for(int i = 0; i < length; i++) {
			
			// This line retrieves the character at the index of the string 'stringX' and assigns it
			// to a new char variable named 'c'
			char c = stringX.charAt(i);
			
			// With this line of code we check if the current character is not hyphen
			// (negative sign). If it is, then we skip the current iteration of the loop
			if(c != '-') { 
				
				// We create a new string 'stringNewX' by replacing the character at the index of
				// string 'stringX' with the character '5'. We do this by concatenating the substring of
				// 'stringX' from index 0 to 'i', the character 5 and the substring of 'stringX' from
				// index i + 1 to length.
				String stringNewX = stringX.substring(0, i) + "5" + stringX.substring(i + 1, length);
				
				// Converting the new string 'stringNewX' to an integer and we assign it to a new
				// integer variable named 'newValue'
				int newValue = Integer.parseInt(stringNewX);
				
				// This line compares the new integer 'newValue' with the current max integer value
				// 'maxValue' and we assign the larger value to 'maxValue'
				maxValue = Math.max(maxValue, newValue);
			}
		}
		// We return the max value integer obtained after adding 5 to one digit inside the decimal
		// representation of the input integer 'X'
		return maxValue;
		
	}
	public static void main(String[] args) {
		Scanner myMax = new Scanner(System.in);
		int X;
		System.out.println("=========================================");
		System.out.println(" ** WELCOME TO THE MAX POSSIBLE VALUE ** ");
		System.out.println("=========================================");
		
		System.out.println("\n\t> Enter an integer");
		X = myMax.nextInt();
		
		System.out.println(solution(X));
		myMax.close();
	}

}
