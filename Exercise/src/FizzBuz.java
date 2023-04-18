import java.util.Scanner;
// @Author Jose Munoz https://www.linkedin.com/in/jose-munoz90/
// @Author Jose Munoz https://github.com/JoseMunoz9

// Given a number 'n', for each integer 'i' in the range from 1 to 'n' inclusive,
// print one value per line as follows:
// If 'i' is a multiple of  both 3 and 5, print: FizzBuzz
// If 'i' is a multiple of 3 (but not 5), print Fizz
// If 'i' is a multiple of 5 (but not 3), print Buzz
// If 'i' is not multiple of 3 or 5, print the value of 'i'
public class FizzBuz {

	public static int fizzBuzz(int n) {
		// Declaring integer 'j' with the value of 15
		int j = 15;
		
		// FOR loop that iterates from 1 to 'j' (15)
		for(int i = 1; i <= j; i++) {
			
			// IF statement: If 'i' is a multiple of both 3 AND 5. In other words, if 'i'
			// is divisible by 15.
			if(i % 15 == 0) {
				System.out.println("FizzBuzz");
			} 
			// IF 'i' is not multiple of 15, we check if it is a multiple of 3
			else if (i % 3 == 0) {
				System.out.println("Fizz");
			} 
			// IF 'i' is not multiple of 15 or 3, we check if it is a multiple of 5
			else if (i % 5 == 0) {
				System.out.println("Buzz");
			}
			// If 'i' is not a multiple of 15, 3 or 5, we execute the following code block:
			else {
				System.out.println(i);
			}
		}
		return j;
	}
	public static void main(String[] args) {
		Scanner myFizzBuzz = new Scanner(System.in);
		
		int i;
		System.out.println("=====================================");
		System.out.println(" ** WELCOME TO THE FIZZ-BUZZ GAME ** ");
		System.out.println("=====================================");
		
		System.out.println("\n\t> Enter an integer");
		i = myFizzBuzz.nextInt();
		
		System.out.println(fizzBuzz(i));
		
		myFizzBuzz.close();
	}

}
