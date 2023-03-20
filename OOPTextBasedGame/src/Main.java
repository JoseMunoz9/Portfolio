import java.util.Scanner;

//@Author Jose Munoz https://www.linkedin.com/in/jose-munoz90/
//@Author Jose Munoz https://github.com/JoseMunoz9

public class Main {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		// Instantiation of the class TextBased:
		TextBased myDungeon = new TextBased();
		
		// Part of a while loop.
		// The game will keep running over and over until some conditions are met.
		boolean running = true;
		
		System.out.println("=====================");
		System.out.println("** TEXT BASED GAME **");
		System.out.println("=====================");
		
		while (running) {
			// MENU
			System.out.println("\n\tSelect one of the options from the menu below:");
			System.out.println("\t1. Play the game.");
			System.out.println("\t2. Exit the application.");
			
			String menu = myScanner.nextLine();
			
			if(menu.equals("1")) {
				myDungeon.WelcomeMessage();
				myDungeon.Dungeon();
			} else if (menu.equals("2")) {
				System.out.println("** APPLICATION CLOSED **");
				break;
			}
			// If the user enters an invalid answer the application will ask them to try again.
			else {
				System.out.println("Invalid input. Try again!");
			}
		}
		myScanner.close();
		System.out.println("=====================");
		System.out.println("** HAVE A GOOD DAY **");
		System.out.println("=====================");
	}

}
