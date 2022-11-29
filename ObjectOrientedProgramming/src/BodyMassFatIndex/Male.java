package BodyMassFatIndex;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Male extends Calculator implements Welcome {
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
		System.out.println("\tBelow 18.5: under-weight range");
		System.out.println("\tBetween 18.5 and 24.9: healthy weight range");
		System.out.println("\tBetween 25 and 29.9: over-weight range");
		System.out.println("\tBetween 30 and 39.9: obese range");
		System.out.println();
		System.out.println("<< HERE WE GO! >>");
	}
	
	@Override
	public void BMIandBFP() {
		Scanner myMan = new Scanner(System.in);
		System.out.println("> Enter your first name:");
		firstName = myMan.nextLine();
		System.out.println("> Enter your surname:");
		lastName = myMan.nextLine();
		System.out.println("Thank you Mr " + lastName + ". Let's calculate your BMI & BFP");
		
		boolean running = true;
		while (running) {
			boolean validAge = false;
			// Here we are doing a do-while loop as well as try-catch in case an invalid answer is entered.
			// The program will not crash and it will keep running and asking until it gets a valid input.
			do {
				System.out.println("> Enter your age: ");
				String ageString = myMan.nextLine();
				
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
				String weightString = myMan.nextLine();
				
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
				String heightString = myMan.nextLine();
				
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
			System.out.println("===============================================");
			System.out.println("> Made a mistake with your DATA?");
			System.out.println("\t1. Let's try again!");
			System.out.println("\t2. Close the calculator.");
			String input4 = myMan.nextLine();
			
			// While loop for validation, to make sure the user enters a valid answer/option/input.
			while (!input4.equals("1") && !input4.equals("2")) {
				System.out.println("## You need to choose a number from the options above! ##");
				input4 = myMan.nextLine();
			}
			if (input4.equals("1")) {
				System.out.println("Let's go again!");
			} else if (input4.equals("2")) {
				System.out.println("<< You have successfully closed the calculator. >>");
				break;
			}
		}
		myMan.close();
		System.out.println("=====================");
		System.out.println("** HAVE A GOOD DAY **");
		System.out.println("=====================");
	}
}
