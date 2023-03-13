import java.text.DecimalFormat;
import java.util.Scanner;

//@Author Jose Munoz https://www.linkedin.com/in/jose-munoz90/
//@Author Jose Munoz https://github.com/JoseMunoz9

public class BMICalculator {
	// BMI stands for: Body Mass Index.
	// BMI calculator helps us to confirm whether our weight is healthy or not.
	// BMI range:
	// ** below 18.5: under-weight range
	// ** between 18.5 and 24.9: healthy weight range
	// ** between 25 and 29.9: over-weight range
	// ** between 30 and 39.9: obese range
	// Reference: https://www.nhs.uk/common-health-questions/lifestyle/what-is-the-body-mass-index-bmi
	// Weight (lbs) / Height (in) ^2 * 703 ---> formula to calculate BMI (Imperial English BMI formula)
	// Weight (kgs) / Height (m) ^2 ---> formula to calculate BMI
	
	private String name;
	private int weight;
	private int height;

	public static void main(String[] args) {
		new BMICalculator();
	}
	
	BMICalculator(){
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("===========================");
		System.out.println("    **BODY MASS INDEX**    ");
		System.out.println("===========================");
		System.out.println("Welcome to BMI calculator"
				+ "\nPlease, enter your name:");
		name = userInput.nextLine();
		
		// Asking the user to type in their weight.
		
		System.out.println("Thanks, " + name + 
				"\nLet us calculate your BMI.");
		
		// Here we are using a do-while loop just so that the program does not crash
		// in case invalid answer is entered.
		boolean validPounds = false;
		do {
			System.out.println("Enter you weight in Pounds (lb): ");
			String weightString = userInput.nextLine();
			
			try {
				weight = Integer.parseInt(weightString);
				validPounds = true;
			} catch(Exception e){
				System.out.println("Invalid input. Try again!");
			}
		} while (validPounds == false);
		
		// Asking the user to enter their height.
		
		// Here we are using a do-while loop just so that the program does not crash
		// in case invalid answer is entered.
		boolean validInches = false;
		do {
			System.out.println("Enter your height in Inches (in): ");
			String heightString = userInput.nextLine();
			
			try {
				height = Integer.parseInt(heightString);
				validInches = true;
			} catch (Exception e) {
				System.out.println("Invalid input. Try again!");
			}
		} while (validInches == false);
		
		System.out.println("Fantastic, your data is: "
		+ weight + "lbs and " + height + " inches.");
		
		
		// Calculating the user's BMI.
		
		double bmi = weight / Math.pow(height, 2) * 703;
		
		DecimalFormat df = new DecimalFormat("0.0"); // With this line of code we are using the first decimal place.
		System.out.println(name + ", your BMI is: "
		+"\nCalculating..." 
				+ "\n" + df.format(bmi));
		
		
		userInput.close();

	} 
 }
