import java.text.NumberFormat;
import java.util.Scanner;

//@Author Jose Munoz https://www.linkedin.com/in/jose-munoz90/
//@Author Jose Munoz https://github.com/JoseMunoz9

public class MortPayment {
	
	// Formula for calculating Mortgage Payment:
	// M = P (i (1 + i)^n / (1 + i)^n - 1)
	// M = Monthly payment
	// P = Principal (total of the loan)
	// i = Interest Rate
	// n = Term, the total of years to pay back the loan
	
	private static final int MONTHS_IN_A_YEAR = 12; // Variable for total of months per year.
	private String firstName;
	private String lastName;
	private double principal;
	private float annualInterestRate;
	private int termInYears;

	public static void main(String[] args) {
		new MortPayment();
	}
	
	MortPayment(){
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Hello, welcome to Mortgage Payment Calculator.");
		System.out.println("Enter your first name: ");
		firstName = myScanner.nextLine();
		
		System.out.println("Thanks" + " "+ firstName + ". Can we get your surname?");
		lastName = myScanner.nextLine();
		
		System.out.println("Great, " + firstName + " "+ lastName + ", let's calculate your monthly payment.");
		
		// We are going to make sure the user enters a correct value using Boolean, do-while loop
		// and Exceptions.
		// If the user does not enter a correct input, the computer will ask again until it gets
		// a valid input.
		// =========================================================================================
		boolean validPrincipal = false;
		do {
			System.out.println("Enter the principal amount: "); // The total of the loan.
			String principalString = myScanner.nextLine();
			// double principal = myScanner.nextDouble();			
			try {
			principal = Integer.parseInt(principalString);
			validPrincipal = true;
			} catch(Exception e) {
			System.out.println("Integers only. Try again!");
			}
		} while(validPrincipal == false);
		
		// ===============================================================================================
		
		boolean validAnnualInterestRate = false;
		do {
			System.out.println("Enter the annual interest rate: "); // Interest rate.
			String annualInterestRateString = myScanner.nextLine();
			//float annualInterestRate = myScanner.nextFloat();
			try {
				annualInterestRate = Integer.parseInt(annualInterestRateString);
				validAnnualInterestRate = true;
			} catch (Exception e) {
				System.out.println("Integers only. Try again!");
			}
			} while(validAnnualInterestRate == false);
		
		// ================================================================================================
		
		boolean validTerm = false;
		do {
			System.out.println("Enter the term of your loan in years: "); // The total of years to pay back the loan.
			String termInYearsString = myScanner.nextLine();
			// int termInYears = myScanner.nextInt();
			
			try {
				termInYears = Integer.parseInt(termInYearsString);
				validTerm = true;
			} catch(Exception e) {
				System.out.println("Integers only. Try again!");
			}
			} while(validTerm == false);
		
		// ================================================================================================
		myScanner.close();
		
		// This is the formula to calculate the monthly payment and the pay back amount.
		// Annual Interest Rate is also divided by 100 just so that the user can enter a whole number.
		float monthlyInterestRate = (annualInterestRate / 100) / MONTHS_IN_A_YEAR;
		int numberOfPayments = termInYears * MONTHS_IN_A_YEAR;
		
		// This is the actual calculation:
		
		double monthlyPayment = principal * (
				(monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, numberOfPayments))) /
				((Math.pow(1 + monthlyInterestRate, numberOfPayments)) - 1));
		
		// Here we are printing the monthly payment AND the total pay back for the loan.
		// Number Format . get Currency Instance() - This line of code will give us total per month using two
		// decimal places (it rounds up the amount).
		
		System.out.println("Mr. " + lastName + ", your monthly payment is: " + NumberFormat.getCurrencyInstance().format(monthlyPayment));
		
		System.out.println("And your total payback amount is: " + NumberFormat.getCurrencyInstance().format(monthlyPayment * numberOfPayments));
	}
}
