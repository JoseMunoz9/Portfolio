import java.util.Random;
import java.util.Scanner;

//@Author Jose Munoz https://www.linkedin.com/in/jose-munoz90/
//@Author Jose Munoz https://github.com/JoseMunoz9

public class RockPaperScissors {
	
	private String name;
	private int age;
	private String[] rps = {"r", "p", "s"};
	private String computerMove = rps[new Random().nextInt(rps.length)];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RockPaperScissors();
	}
	
	RockPaperScissors(){
		
		Scanner myScanner = new Scanner(System.in);
		Scanner myGame = new Scanner(System.in);
		
		// Asking for name and age to enter the game.
		
		System.out.println("Please, enter your name: ");
		name = myGame.nextLine();
		System.out.println("Thanks, " + name + ". Please, enter your age.");
		
		// In this section we are making sure the user enters a valid input (integer).
		// If the user does not enter an integer, the computer asks to try again
		// until a valid answer is entered.
		boolean validAge = false;
		do {
			Scanner myAge = new Scanner(System.in);
			String ageString = myAge.nextLine();
			
			try {
				age = Integer.parseInt(ageString);
				validAge = true;
			} catch(Exception e) {
				System.out.println("Your age must be an integer, try again!");
			}
		} while(validAge == false);
		
		// With the while-loop the program runs again if the user wants to keep playing.
		while(true) {
		String playerMove;
		
		while (true) {
			System.out.println("Great, you can now start playing with the computer. Enter your move (r, p or s): ");
			playerMove = myScanner.nextLine();
			
			// This is a validation for the game. If the user does not enter a valid move,
			// the computer asks to try again until a valid input is entered.
			
			if(playerMove.equals("r") || playerMove.contentEquals("p") || playerMove.equals("s")) {
				break;
			}
			System.out.println(playerMove + " is not a valid move.");
		}
		
		System.out.println("Computer played: " + computerMove);
		
		if (playerMove.equals(computerMove)) {
			System.out.println("The game was a tie!");
		} else if(playerMove.equals("r")) {
			if(computerMove.equals("p")) {
				System.out.println("Computer wins!");
			} else if(computerMove.equals("s")) {
				System.out.println("Congratulations, " + name + ". You won");
			}
		}
		else if(playerMove.equals("p")) {
			if(computerMove.equals("r")) {
				System.out.println(name + ", you win.");
			} else if (computerMove.equals("s")) {
				System.out.println("Sorry, " + name + ". You lose this one.");
			}
		}
		else if(playerMove.equals("s")) {
			if(computerMove.equals("p")) {
				System.out.println(name + ", you win.");
			} else if (computerMove.equals("r")) {
				System.out.println("Sorry, " + name + ". You lose this one.");
			}
		}
		
		// Here we ask the user if they want to keep playing or not.
		System.out.println("Would you like to play again?");
		System.out.println("Enter Y for yes or N for no");
		String playAgain = myScanner.nextLine();
		
		// If the user says Y, the game starts again, else, the game is over.
		if(!playAgain.equals("y")) {
			break;
		}
	}
  }
}
