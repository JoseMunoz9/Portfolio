package BodyMassFatIndex;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Female extends Calculator {
	//In this method we are calculating both BMI and BFP for a FEMALE.
	// The formula for calculating BFP for a female is a bit different.
	// This is the reason why I divided the calculator in two.
	String firstName;
	String lastName;
	int age;
	int weight;
	int height;
	
	@Override
	public void BMIandBFP() {
		Scanner myFemme = new Scanner(System.in);
		System.out.println("> Enter your first name:");
		firstName = myFemme.nextLine();
		System.out.println("> Enter your surname: ");
		lastName = myFemme.nextLine();
		System.out.println("> Thank you Ms " + lastName + ". Let's calculate your BMI & BFP");
		
		boolean running = true;
		while (running) {
			boolean validAge = false;
			// Here we are doing a do-while loop as well as try-catch in case an invalid answer is entered.
			// The program will not crash and it will keep running and asking until it gets a valid input.
			do {
				System.out.println("> Enter your age: ");
				String ageString = myFemme.nextLine();
				
				try {
					age = Integer.parseInt(ageString);
					validAge = true;
				} catch (Exception e) {
					System.out.println("## You must enter an integer ##");
				}
			} while(validAge == false);
			// ===================================================================
			
			boolean validPounds = false;
			// Here we are doing a do-while loop as well as try-catch in case an invalid answer is entered.
			// The program will not crash and it will keep running and asking until it gets a valid input.
			do {
				System.out.println("> Enter your weight in pounds: ");
				String weightString = myFemme.nextLine();
				
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
				String heightString = myFemme.nextLine();
				
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
			double bfp = (1.20 * bmi) + (0.23 * age) - 5.4; // formula for calculating BFP for a FEMALE.
			DecimalFormat df = new DecimalFormat("0.0"); // with this line of code we are asking the computer to use the first decimal.
			
			System.out.println("Ms. " + firstName + " " + lastName + ", your BMI is: " + df.format(bmi)
			+ "\nand your BFP is: " + df.format(bfp));
			System.out.println("===============================================");
			System.out.println("> What would you like to do now?");
			System.out.println("\t1. Let's try again!");
			System.out.println("\t2. Close the calculator.");
			String input4 = myFemme.nextLine();
			
			// While loop for validation, to make sure the user enters a valid answer/option/input.
			while (!input4.equals("1") && !input4.equals("2")) {
				System.out.println("## You need to choose a number from the options above! ##");
				input4 = myFemme.nextLine();
			}
			if (input4.equals("1")) {
				System.out.println("Let's go again!");
			} else if (input4.equals("2")) {
				System.out.println("<< You have successfully closed the calculator. >>");
				break;
			}
		}
		
		myFemme.close();
		System.out.println("=====================");
		System.out.println("** HAVE A GOOD DAY **");
		System.out.println("=====================");
		
	}

}