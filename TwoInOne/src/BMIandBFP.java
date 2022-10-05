import java.text.DecimalFormat;
import java.util.Scanner;

//@Author Jose Munoz https://www.linkedin.com/in/jose-munoz90/
//@Author Jose Munoz https://github.com/JoseMunoz9

public class BMIandBFP {
	
	// Formula for calculating BFP for women: (1.20 * BMI) + (0.23 * Age) - 5.4 = BFP
	// Formula for calculating BFP for men: (1.20 * BMI) + (0.23 * Age) - 16.2 = BFP
	// Formula for calculating BMI: Weight (lbs) / Height (in) ^2 * 703
	
	private String firstName;
	private String lastName;
	private String gender;
	private int weight;
	private int height;
	private int age;

	public static void main(String[] args) {
		new BMIandBFP();
	}
	
	BMIandBFP(){
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Welcome to BMI and BFP calculator. Let us start.");
		System.out.println("Enter your gender. It must be either MALE or FEMALE.");
		
		// do-while loop to check if the user enter a valid input. If not, the computer
		// will keep asking until they type a valid answer.
		
		do {
			Scanner myGender = new Scanner(System.in);
			gender = myGender.nextLine();
		} while(checkGender(gender));
		
		
		// if-else statement to get the BMI and BFP for either MALE or FEMALE.
		if(gender.equalsIgnoreCase("female")) {
			// if it is a FEMALE, then the computer does this:
			female();
		}else if(gender.equalsIgnoreCase("male")) {
			// if it is a MALE, then the computer does this:
			male();
		}else {
			System.out.println("It must be either male or female. Try again!");
		}
		userInput.close();
	}

	private void male() {
		// In this method we are calculating both BMI and BFP for a MALE.
		// The formula for calculating BFP for a man is different.
		// This is why I have divided the calculator in two. One for MALE and a second one for a FEMALE.
		
		boolean validPounds = false;
		System.out.println("Enter your first name:");
		Scanner myFirst = new Scanner(System.in);
		firstName = myFirst.nextLine();
		
		System.out.println("Enter your surname:");
		Scanner myLast = new Scanner(System.in);
		lastName = myLast.nextLine();
		
		System.out.println("Thanks Mr. " + lastName + ", let's calculate your BMI first.");
		
		// Here we are doing a do-while loop and try-catch in case an invalid answer is entered.
		// The program will not crash and it will keep running and asking until it gets a valid input.

		do {
			System.out.println("Enter your weight in pounds (lbs):");
			Scanner myWeight = new Scanner(System.in);
			String weightString = myWeight.nextLine();
			
			try {
				weight = Integer.parseInt(weightString);
				validPounds = true;
			}catch(Exception e){
				System.out.println("Invalid input. Try again!");
			}
		}while(validPounds == false);
		
		boolean validInches = false;
		// The process for this second question is exact the same as the first one above.
		// Do-while loop and try-catch.
		do {
			System.out.println("Enter your height in inches.");
			Scanner myInches = new Scanner(System.in);
			String heightString = myInches.nextLine();
			
			try {
				height = Integer.parseInt(heightString);
				validInches = true;
			} catch (Exception e) {
				System.out.println("Invalid input. Try again!");
			}
		}while(validInches == false);
		
		// Here we are getting the user's age just so that we can calculate the BFP.
		boolean validAge = false;
		do {
			System.out.println("Mr. " + lastName + ", what's your age?");
			Scanner myAge = new Scanner(System.in);
			String ageString = myAge.nextLine();
			
			try {
				age = Integer.parseInt(ageString);
				validAge = true;
			}catch(Exception e) {
				System.out.println("Mr. " + lastName + ", you must enter integers only. Try again!");
			}
		}while(validAge == false);
		
		double bmi = weight / Math.pow(height, 2) * 703; // formula for calculating BMI.
		double bfp = (1.20 * bmi) + (0.23 * age) - 16.2; // formula for calculating BFP using BMI data.
		DecimalFormat df = new DecimalFormat("0.0"); // with this line of code we are asking the computer to use the first decimal only.
		System.out.println("Mr. " + firstName + " " + lastName + ", your BMI is: " + df.format(bmi));
		System.out.println("Mr. " + firstName + " " + lastName + ", your BFP is: " + df.format(bfp));
	}

	private void female() {
		//In this method we are calculating both BMI and BFP for a FEMALE.
		// The formula for calculating BFP for a lady is different.
		// This is the reason why I divided the calculator in two.
		boolean validPounds = false;
		System.out.println("Enter your first name:");
		Scanner myFem = new Scanner(System.in);
		firstName = myFem.nextLine();
		
		System.out.println("Enter your surname:");
		Scanner myLast = new Scanner(System.in);
		lastName = myLast.nextLine();
		
		System.out.println("Thanks Ms. " + lastName + ", let us calculate your BMI first.");
		
		// Do-while loop and Try-Catch just so that the program does not crash in case an invalid
		// input is entered.
		do {
			System.out.println("Enter your weight in pounds (lbs).");
			Scanner myPounds = new Scanner(System.in);
			String weightPounds = myPounds.nextLine();
			
			try {
				weight = Integer.parseInt(weightPounds);
				validPounds = true;
			} catch(Exception e) {
				System.out.println("Invalid input. Try again!");
			}
		} while(validPounds == false);
		
		boolean validInches = false;
		// The same process in question one has implemented on this question using a Do-while loop and
		// Try-Catch.
		do {
			System.out.println("Enter your height in inches.");
			String heightInches = myFem.nextLine();
			
			try {
				height = Integer.parseInt(heightInches);
				validInches = true;
			} catch(Exception e) {
				System.out.println("Invalid input. Try again!");
			}
		}while(validInches == false);
		
		// Here we are getting the user's age just so that we can calculate their BFP.
		boolean validAge = false;
		do {
			System.out.println("Ms. " + lastName + ", what's your age?");
			Scanner myAge = new Scanner(System.in);
			String ageString = myAge.nextLine();
			
			try {
				age = Integer.parseInt(ageString);
				validAge = true;
			}catch(Exception e) {
				System.out.println("Ms. " + lastName + ", you must enter integers only. Try again!");
			}
		}while(validAge == false);
		
		double bmi = weight / Math.pow(height, 2) * 703; // formula for calculating BMI.
		double bfp = (1.20 * bmi) + (0.23 * age) - 5.4; // formula for calculating BFP for a FEMALE.
		DecimalFormat df = new DecimalFormat("0.0"); // with this line of code we are asking the computer to use the first decimal.
		System.out.println("Ms. " + firstName + " " + lastName + ", your BMI is: " + df.format(bmi));
		System.out.println("Ms. " + firstName + " " + lastName + ", your BFP is: " + df.format(bfp));
		
	}
    // With this method we are checking if the user has entered a valid input, if not, the computer
	// asks until it gets a valid answer.
	private boolean checkGender(String gender) {
		if(gender.equalsIgnoreCase("female")) {
			return false;
		}else if(gender.equalsIgnoreCase("male")) {
			return false;
		}else {
			System.out.println("It must be either male or female. Try again!");
			return true;
		}
	}

}
