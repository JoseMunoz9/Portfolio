import java.text.DecimalFormat;
import java.util.Scanner;

public class BFPCalculator {
	
	private String name;
	private String gender;
	private int weight;
	private int wrist;
	private int waist;
	private int hip;
	private int forearm;

	public static void main(String[] args) {
		new BFPCalculator();
	}
	BFPCalculator(){
		System.out.println("Body Fat Calculator");
		System.out.println("*******************");
		
		System.out.println("Please enter your first and last name: ");
		Scanner input = new Scanner(System.in);
		name = input.nextLine();
		
		
		// With this do-while loop the computer checks whether it's a valid input or not. If not, then
		// the computer repeats the process until the condition is met.
		
		System.out.println("Thanks " + name + ". Enter your gender. Note: It MUST be either female or male.");
		do {
			Scanner myGender = new Scanner(System.in);
			gender = myGender.nextLine();
		} while (checkGender(gender));
		
		// Here we are telling the computer what gender to calculate, MALE or FEMALE
		// If the user types in FEMALE, then the computer calculates for a female.
		
		if(gender.equalsIgnoreCase("female")) {
			femCalc();
			
			// If the user types in MALE, then the computer calculates for a male.
		}else if (gender.equalsIgnoreCase("male")) {
			maleCalc();
			
			// if the user types in anything else, the computer pops up this message:
		}else {
			System.out.println("It MUST be either FEMALE or MALE. Try again!");
		}
	 input.close();
	}
	private boolean checkGender(String gender) {
		if(gender.equalsIgnoreCase("female")) {
			return false;
		}else if(gender.equalsIgnoreCase("male")) {
			return false;
		}else {
			System.out.println(name + ", this is an invalid input. Try again!");
			return true;
		}
	}
	
	// With this method the computer calculates the BFP for a male.
	
	private void maleCalc() {
		
		// Do-while loop for each question that helps to validate whether the input is correct or not.
		
		boolean validWeight = false;
		System.out.println("Enter your body weight in pounds: ");
		do {
			Scanner myWeight = new Scanner(System.in);
			String weightString = myWeight.nextLine();
			
			try {
				weight = Integer.parseInt(weightString);
				validWeight = true;
			}catch (Exception e){
				System.out.println("Invalid input. Try again!");
			}
		} while(validWeight == false);
		
		boolean validWaist = false;
		System.out.println("Enter the size of your waist (At Navel) in inches: ");
		do {
			Scanner myWaist = new Scanner(System.in);
			String waistString = myWaist.nextLine();
			
			try {
				waist = Integer.parseInt(waistString);
				validWaist = true;
			} catch(Exception e) {
				System.out.println("Integers only. Try again!");
			}
		} while(validWaist == false);
		
		final float A1 = weight * 1.082f + 94.42f;
		final float A2 = waist * 4.15f;
		final float B = A1 - A2;
		final float BodyFat = weight - B;
		final float BFP = BodyFat * 100f / weight;
		
		System.out.println("********************");
		DecimalFormat df = new DecimalFormat("0.0"); // with this line of code we are using the first decimal.
		System.out.println(name + ", your Body Fat is: " + df.format(BodyFat));
		System.out.println(name + ", your Body Fat Percentage is: " + df.format(BFP) + "%");
	}
	
	// With this method the computer calculates the BFP for a female.
	private void femCalc() {
		
		// Do-while loop for each question that helps to validate whether the input is correct or not.
		
		boolean validWeight = false;
		System.out.println("Enter your weight in pounds: ");
		do {
			Scanner myWeight = new Scanner(System.in);
			String weightString = myWeight.nextLine();
			
			try {
				weight = Integer.parseInt(weightString);
				validWeight = true;
			} catch(Exception e) {
				System.out.println("Invalid input. Try again!");
			}
		} while (validWeight == false);
		
		boolean validWrist = false;
		System.out.println("Enter the size of your wrist (At fullest point) in inches: ");
		do {
			Scanner myWrsit = new Scanner(System.in);
			String wristString = myWrsit.nextLine();
			
			try {
				wrist = Integer.parseInt(wristString);
				validWrist = true;
			} catch(Exception e) {
				System.out.println("Invalid input. Try again!");
			}
		} while(validWrist == false);
		
		boolean validWaist = false;
		System.out.println("Enter the size of your waist (At navel) in inches: ");
		do {
			Scanner myWaist = new Scanner(System.in);
			String waistString = myWaist.nextLine();
			
			try {
				waist = Integer.parseInt(waistString);
				validWaist = true;
			} catch (Exception e) {
				System.out.println("Invalid input. Try again!");
			}
		} while(validWaist == false);
		
		
		boolean validHip = false;
		System.out.println("Enter the size of your hip (At fullest point) in inches: ");
		do {
			Scanner myHip = new Scanner(System.in);
			String hipString = myHip.nextLine();
			
			try {
				hip = Integer.parseInt(hipString);
				validHip = true;
			} catch (Exception e) {
				System.out.println("Invalid input. Try again!");
			}
		} while(validHip == false);
		
		boolean validForearm = false;
		System.out.println("Enter the size of your forearm (At fullest point) in inches: ");
		do {
			Scanner myForeArm = new Scanner(System.in);
			String forearmString = myForeArm.nextLine();
			
			try {
				forearm = Integer.parseInt(forearmString);
				validForearm = true;
			} catch (Exception e) {
				System.out.println("Invalid input. Try again!");
			}
		} while(validForearm == false);
		
		final float A1 = weight * 0.732f + 8.987f;
		final float A2 = wrist / 3.140f;
		final float A3 = waist * 0.157f;
		final float A4 = hip * 0.249f;
		final float A5 = forearm * 0.434f;
		final float B = A1 + A2 - A3 - A4 + A5;
		final float BodyFat = weight - B;
		final float BFP = BodyFat * 100f / weight;
		
		System.out.println("********************");
		DecimalFormat df = new DecimalFormat("0.0"); // with this line of code we are using the first decimal.
		System.out.println(name + ", your Body Fat is: " + df.format(BodyFat));
		
		System.out.println(" ");
		System.out.println("and you Body Fat Percentage is: " + df.format(BFP) + "%");
	}

}
