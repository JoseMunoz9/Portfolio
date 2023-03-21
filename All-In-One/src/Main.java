import java.util.Scanner;

import BodyMassFatIndex.Calculator;
import WorldGame.Game;

// @Author Jose Munoz https://www.linkedin.com/in/jose-munoz90/
// @Author Jose Munoz https://github.com/JoseMunoz9

public class Main {

	public static void main(String[] args) {
		Scanner allinOne = new Scanner(System.in);
		
		// Instantiation of classes
		Calculator myCalculator = new Calculator();
		Game myGame = new Game();
		
		boolean running = true;
				
		System.out.println("=========================================");
		System.out.println(" ** WELCOME TO ALL-IN-ONE APPLICATION ** ");
		System.out.println("=========================================");
		
		while (running) {
			System.out.println("\nWHAT WOULD YOU LIKE TO DO?");
			System.out.println("\t1. BMI & BFP calculator");
			System.out.println("\t2. Let's play a game");
			System.out.println("\t3. Exit the application");
			
			String menu = allinOne.nextLine();
			
			if (menu.equals("1")) {
				myCalculator.calculator();
			} else if (menu.equals("2")) {
				myGame.Fun();
			} else if (menu.equals("3")) {
				System.out.println("\t** APPLICATION CLOSED **");
				break;
			}
			else {
				System.out.println("\t** INVALID INPUT - TRY AGAIN **");
				System.out.println("=========================================");
			}
		}
		allinOne.close();
		System.out.println("=====================");
		System.out.println("** HAVE A GOOD DAY **");
		System.out.println("=====================");

	}

}
