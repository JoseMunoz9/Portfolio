package BodyMassFatIndex;

import java.util.Scanner;

// @Author Jose Munoz https://www.linkedin.com/in/jose-munoz90/
// @Author Jose Munoz https://github.com/JoseMunoz9

public class Main {

	public static void main(String[] args) {
		
		Scanner myCalculator = new Scanner(System.in);
		// Instantiation of our classes, MALE and FEMALE:
		Male myMale = new Male();
		Female myFemale = new Female();
		
		System.out.println("*****  WELCOME TO BMI & BFP CALCULATOR  *****");
		System.out.println("== Body Mass Index and Body Fat Percentage ==");
		System.out.println();
		System.out.println("> There are two formulas to calculate BMI & BFP."
				+ "\n\tGeneral BMI formula: Weight (lbs) / Height (in) ^2 * 703"
				+ "\n\tFor women: (1.20 * BMI) + (0.23 * Age) - 5.4 = BFP"
				+ "\n\tFor men: (1.20 * BMI) + (0.23 * Age) - 16.2 = BFP");
		System.out.println();
		System.out.println("> Let's begin: What's your gender?");
		System.out.println("\t1. Female");
		System.out.println("\t2. Male");
		String gender = myCalculator.nextLine();
		
		// While loop for validation, to make sure the user enters a valid answer/option/input.
		
		while (!gender.equals("1") && !gender.equals("2")) {
			System.out.println("You need to select a number from the menu.");
			gender = myCalculator.nextLine();
		}
		// 'IF' statements to apply the proper method for each option from the menu above.
		if (gender.equals("1")) {
			myFemale.BMIandBFP(); // Calculator method for a female.
		} else if (gender.equals("2")) {
			myMale.BMIandBFP(); // Calculator method for a male.
		}
		myCalculator.close();

	}

}
