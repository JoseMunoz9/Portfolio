package BodyMassFatIndex;

// @Author Jose Munoz https://www.linkedin.com/in/jose-munoz90/
// @Author Jose Munoz https://github.com/JoseMunoz9

import java.text.DecimalFormat;
import java.util.Scanner;

public class Male extends Formula implements Welcome{
	
	// Male class that requires Scanner: 'allinOne' dependency.
			Scanner allinOne;
			
			public Male(Scanner allinOne) {
				this.allinOne = allinOne;
			}
	
	// In this method we are calculating both BMI and BFP for a MALE.
	// The formula for calculating BFP for a man is different.
	// This is why I have divided the calculator in two. One for MALE and a second one for a FEMALE.
	
	String firstName;
	String lastName;
	int age;
	int weight;
	int height;

	
	@Override
	public void WelcomeMessage() {
		
		System.out.println("=============================================");		
		System.out.println("       WELCOME TO THE MALE CALCULATOR        ");		
		System.out.println("=============================================");
		System.out.println();
		System.out.println("> Note:");
		System.out.println("\t- Below 18.5: under-weight range");
		System.out.println("\t- Between 18.5 and 24.9: healthy weight range");
		System.out.println("\t- Between 25 and 29.9: over-weight range");
		System.out.println("\t- Between 30 and 39.9: obese range");
		System.out.println();
		System.out.println("<< HERE WE GO! >>");
		
	}
	
	@Override
	public void BMIandBFP() {
		
	//	Scanner myMan = new Scanner(System.in);
		System.out.println("> Enter your first name:");
		firstName = allinOne.nextLine();
		System.out.println("> Enter your surname:");
		lastName = allinOne.nextLine();
		System.out.println("Thank you Mr " + lastName + ". Let's calculate your BMI & BFP");
		
		boolean running = true;
		while (running) {
			boolean validAge = false;
			// Here we are doing a do-while loop as well as try-catch in case an invalid answer is entered.
			// The program will not crash and it will keep running and asking until it gets a valid input.
			do {
				System.out.println("> Enter your age: ");
				String ageString = allinOne.nextLine();
				
				try {
					age = Integer.parseInt(ageString);
					validAge = true;
				} catch(Exception e) {
					System.out.println("## You must enter an integer ##");
				}
			} while (validAge == false);
			// ===================================================================
			boolean validPounds = false;
			// Here we are doing a do-while loop as well as try-catch in case an invalid answer is entered.
			// The program will not crash and it will keep running and asking until it gets a valid input.
			do {
				System.out.println("> Enter your weight in pounds: ");
				String weightString = allinOne.nextLine();
				
				try {
					weight = Integer.parseInt(weightString);
					validPounds = true;
				} catch (Exception e) {
					System.out.println("## Invalid. You must enter an integer ##");
				}
			} while (validPounds == false);
			// ===================================================================
			boolean validInches = false;
			// Here we are doing a do-while loop as well as try-catch in case an invalid answer is entered.
			// The program will not crash and it will keep running and asking until it gets a valid input.
			do {
				System.out.println("> Enter your height in inches: ");
				String heightString = allinOne.nextLine();
				
				try {
					height = Integer.parseInt(heightString);
					validInches = true;
				} catch (Exception e) {
					System.out.println("## Integers only ##");
				}
			} while (validInches == false);
			
			// ===================================================================
			// Calculator
			double bmi = weight / Math.pow(height, 2) * 703; // formula for calculating BMI.
			double bfp = (1.20 * bmi) + (0.23 * age) - 16.2; // formula for calculating BFP using BMI data.
			DecimalFormat df = new DecimalFormat("0.0"); // with this line of code we are asking the computer to use the first decimal only.
			
			System.out.println("===============================================");
			System.out.println(" > Mr " + firstName + " " + lastName + ", these are your results:");
			System.out.println("\tBMI: " + df.format(bmi)
							   + "\n\tBFP: " + df.format(bfp));
			if(bmi < 18.5) {
				System.out.println(firstName + ", your results indicate that you are on the 'underweight' range."
						+ "\n\t> Your BMI is under 18.5");
			} else if(bmi >= 18.5 && bmi <= 24.9) {
				System.out.println(firstName + ", your results indicate that you are on the 'healthy weight' range:"
						+ "\n\t> Your BMI is between 18.5 - 24.9"
						+ "\n\tCongratulations, keep it up!!");
			} else if(bmi >= 25 && bmi <= 29.9) {
				System.out.println(firstName + ", your results indicate that you are on the 'overweight' range."
						+ "\n\t> Your BMI is between 25 - 29.9");
			} else if(bmi >= 30 && bmi <= 39.9) {
				System.out.println(firstName + ", these are not good news. Your BMI "
						+ "is between 30 - 39.9 which falls in the 'obese' category.");
			}
			System.out.println("===============================================");
			System.out.println("> Made a mistake with your DATA?");
			System.out.println("\t1. Let's try again!");
			System.out.println("\t2. Close the calculator.");
			String input4 = allinOne.nextLine();
			
			// While loop for validation, to make sure the user enters a valid answer/option/input.
			while (!input4.equals("1") && !input4.equals("2")) {
				System.out.println("## You need to choose a number from the options above! ##");
				input4 = allinOne.nextLine();
			}
			if (input4.equals("1")) {
				System.out.println("Let's go again!");
			} else if (input4.equals("2")) {
				System.out.println("<< You have successfully closed the calculator. >>");
				System.out.println("==================================================");
				break;
			}
		}	
	}

}
