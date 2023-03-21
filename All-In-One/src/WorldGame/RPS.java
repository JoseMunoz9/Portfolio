package WorldGame;

// @Author Jose Munoz https://www.linkedin.com/in/jose-munoz90/
// @Author Jose Munoz https://github.com/JoseMunoz9

import java.util.Scanner;
import java.util.Random;

public class RPS {
	
	String[] rps = {"r", "p", "s"};
	String computerMove = rps[new Random().nextInt(rps.length)];

	public void RockPaperScissors() {
		
		Scanner rps = new Scanner(System.in);
		
		while(true) {
			String playerMove;
			
			while(true) {
				System.out.println("\t** YOU ARE NOW PLAYING: ROCK, PAPER, SCISSORS **");
				System.out.println("\n> Your moves are: r, p or s. "
						+ "\n\tEnter your move now:");
				playerMove = rps.nextLine();
				
				// This is a validation for the game. If the user does not enter a valid move,
				// the computer asks to try again until a valid input is entered.
				
				if(playerMove.equals("r") || playerMove.contentEquals("p") || playerMove.equals("s")) {
					break;
				}
				System.out.println(playerMove + " is not a valid move.");
			}
			System.out.println("COMPUTER PLAYED: " + computerMove);
			
			if (playerMove.equals(computerMove)) {
				System.out.println("\n<< The game was a tie! >>");
			} else if(playerMove.equals("r")) {
				if(computerMove.equals("p")) {
					System.out.println("\n<< COMPUTER WINS! >>");
				} else if(computerMove.equals("s")) {
					System.out.println("\n<< Congratulations, YOU WON. >>");
				}
			}
			else if(playerMove.equals("p")) {
				if(computerMove.equals("r")) {
					System.out.println("\n<< You win. >>");
				} else if (computerMove.equals("s")) {
					System.out.println("\n<< Sorry, you lose this one. >>");
				}
			}
			else if(playerMove.equals("s")) {
				if(computerMove.equals("p")) {
					System.out.println("\nYou win.");
				} else if (computerMove.equals("r")) {
					System.out.println("\n<< Sorry, you lose this one. >>");
				}
			}
			
			// Here we ask the user if they want to keep playing or not.
			System.out.println("\n> Would you like to play again?");
			System.out.println("\n\tEnter Y for yes or N for no");
			String playAgain = rps.nextLine();
			
			// If the user says Y, the game starts again, else, the game is over.
			if(!playAgain.equals("y")) {
				break;
			}
			// rps.close();
		}
	}
}
