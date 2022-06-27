import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//@Author Jose Munoz https://www.linkedin.com/in/jose-munoz90/
//@Author Jose Munoz https://github.com/JoseMunoz9

public class Validation {
	
	private String name;
	private int age;
	private String email;
	
	public static void main(String[] args) {
		new Validation();
	}
	
	
	Validation() {
		
		// Here we are going to ask and store the user's details for verification purposes.
		
		System.out.println("Please enter your first and last name: ");
			Scanner myScanner = new Scanner(System.in);
			name = myScanner.nextLine();
			
		
		// Here we are reminding the user the age limit.
		
		System.out.println("Thanks, " + name + ". Now enter your age. Note: You must be OVER 15 years old and UNDER 50 years old.");
		do {
			Scanner myAge = new Scanner(System.in);
			age = myAge.nextInt();
			
		} while (checkAge(age));
		
		
		// Here we are going to ask for the user's email address and check whether is valid or not.
		System.out.println("Thanks, " + name + ". Please enter valid email address for verification purposes:");
		do {
			Scanner myEmail = new Scanner(System.in);
			email = myEmail.nextLine();
		} while (checkEmail(email));
	}
	
	// Here we are going to set up the conditions for the validation process.
	
	public boolean checkAge(int age) {
		if (age >= 15 && age <= 50) {
			return false;
		} else {
			System.out.println("Sorry for the inconvenience, only people between 15 and 50 years old are allowed to enter this site. Please try again.");
			return true;
		}
	}
	
	public boolean checkEmail (String email) {
		if (email.endsWith(".com") && email.contains("@")) {
			System.out.println("Welcome to our world " + name + ". You're age is " + age + ". Excellent, you may now enjoy.");
			return false;
		} else {
			System.out.println("Oh, oh! It looks like ' " + email + " ' is not a valid email address. Please try again:");
			return true;
		}
	}
}


		
	


