import java.text.DecimalFormat;
import java.util.Scanner;

//@Author Jose Munoz https://www.linkedin.com/in/jose-munoz90/
//@Author Jose Munoz https://github.com/JoseMunoz9

public class BMICalculator {
	
	// Weight (kg) / Height (in) ^2 * 703
	
	private String name;
	private int weight;
	private int height;
	private double bmi;

	public static void main(String[] args) {
		new BMICalculator();
	}
	
	BMICalculator(){
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Hello and welcome to BMI calculator. Please, enter your name:");
		Scanner myName = new Scanner(System.in);
		name = myName.nextLine();
		
		// Asking the user to type in their weight
		
		System.out.println("Thanks " + name + ". Let us calculate your BMI.");
		System.out.println("Enter you weight in Pounds (lb): ");
			Scanner myWeight = new Scanner(System.in);
			int weight = myWeight.nextInt();
		
		// Asking the user to enter their height
		
		System.out.println("Great, now enter your height in Inches (in): ");
			Scanner myHeight = new Scanner(System.in);
			int height = userInput.nextInt();
		
		System.out.println("You have confirmed your weight AND height being " + weight + " - " + height);
		
		
		// Calculating the user's BMI
		
		double bmi = weight / Math.pow(height, 2) * 703;
		
		DecimalFormat df = new DecimalFormat("0.0"); // With this line of code we are using the first decimal place
		System.out.println(name + ", your BMI is: " + df.format(bmi));
		
		userInput.close();

	}

}
