import java.text.DecimalFormat;
import java.util.Scanner;

//@Author Jose Munoz https://www.linkedin.com/in/jose-munoz90/
//@Author Jose Munoz https://github.com/JoseMunoz9

public class BMICalculator {
	
	// Weight (kg) / Height (in) ^2 * 703

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		// Asking the user to type in their weight
		
		System.out.println("Please, enter you weight in Pounds (lb): ");
			double weight = userInput.nextDouble();
		
		// Asking the user to enter their height
		
		System.out.println("Now, enter your height in Inches (in): ");
		double height = userInput.nextDouble();
		System.out.println("You have confirmed your weight AND height being " + weight + " - " + height);
		
		
		// Calculating the user's BMI
		
		double bmi = weight / Math.pow(height, 2) * 703;
		
		DecimalFormat df = new DecimalFormat("0.0"); // With this line of code we are using the first decimal only
		System.out.println("Your BMI is: " + df.format(bmi));
		
		userInput.close();

	}

}
