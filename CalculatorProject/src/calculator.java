import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		
		String firstName;
		String lastName;
		String user;
		
		int num1 = 0;
		int num2 = 0;
		char Calculation;
		double answer = 0.0;
		
		Scanner myScanner = new Scanner(System.in);
		
		// Here we are going to get the user's input for the calculation.
		
		System.out.println("Please enter your first name: ");
		firstName = myScanner.nextLine();
		
		System.out.println("Please enter your last name: ");
		lastName = myScanner.nextLine();
		
		System.out.println("Nice to meet you " + firstName + " "+ lastName + ", let us know what numbers you would like to calculate.");
		
		System.out.println("Please enter your first number:");
		num1 = myScanner.nextInt();
		
		System.out.println("Please enter your second numnber:");
		num2 = myScanner.nextInt();
		
		System.out.println("What operation would you like to execute?");
		Calculation = myScanner.next().charAt(0);
		
		// Here we are going to tell the computer what mathematical operation we are going to execute:
		
		switch(Calculation) {
		
		case '+' : answer = num1 + num2;
					break;
		case '-' : answer = num1 - num2;
					break;
		case '/' : answer = num1 / num2;
					break;
		case '*' : answer = num1 * num2;
					break;
		}
		
		// Here the computer will give us the result of the calculation and then will ask the user
		// if they want to execute another operation.
		
		System.out.println(firstName + ", " + num1 + " " + Calculation + " " + num2 + " is " + answer + " - Would you like to calculate something else?");
		user = myScanner.next();
		
		if (user.equals("Yes")) {
			
			// If the user wants to execute another operation, then the computer will start again.
			
			System.out.println("Please enter your first number: ");
			num1 = myScanner.nextInt();
			
			System.out.println("Please enter your second numnber: ");
			num2 = myScanner.nextInt();
			
			System.out.println("What operation would you like to execute?");
			Calculation = myScanner.next().charAt(0);
			
			switch(Calculation) {
			
			case '+' : answer = num1 + num2;
						break;
			case '-' : answer = num1 - num2;
						break;
			case '/' : answer = num1 / num2;
						break;
			case '*' : answer = num1 * num2;
						break;
			}
			
			System.out.println(firstName + ", " + num1 + " " + Calculation + " " + num2 + " is " + answer);
		}
		else if (user.equals("No")) {
			
			// If the user does not want to execute another one, then the program will finish.
			
			System.out.println("Perfect, have a good day " + firstName+ ".");
			
		}
		
		// System.exit(0);
		myScanner.close();

	}

}
