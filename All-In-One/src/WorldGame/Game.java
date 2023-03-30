package WorldGame;
import java.util.Scanner;

// @Author Jose Munoz https://www.linkedin.com/in/jose-munoz90/
// @Author Jose Munoz https://github.com/JoseMunoz9

public class Game {
	
	// Game class that requires Scanner: 'allinOne' dependency.
		Scanner allinOne;
		
		public Game(Scanner allinOne) {
			this.allinOne = allinOne;
		}
	
	public void Fun() {
	//	Scanner myGame = new Scanner(System.in);
		
		// Instantiation of the classes
		PlayOFF myDungeon = new PlayOFF(allinOne);
		RPS myRockPaperScissors = new RPS(allinOne);
		
		// Part of a while loop.
		// The game will keep running over and over until some conditions are met.
		boolean running = true;
		
		System.out.println("===============================");
		System.out.println("** WELCOME TO THE GAME WORLD **");
		System.out.println("===============================");
		
		while (running) {
			// MENU
			System.out.println("\nWHAT GAME WOULD YOU LIKE TO PLAY?");
			System.out.println("\t1. Adventure Game: Vampires, Witches, Lycans, Hunters");
			System.out.println("\t2. Rock, Paper, Scissors");
			System.out.println("\t3. Exit the Game World");
						
			String menu = allinOne.nextLine();
			
			if (menu.equals("1")) {
				myDungeon.WelcomeMessage();
				myDungeon.Dungeon();
			} else if (menu.equals("2")) {
				myRockPaperScissors.RockPaperScissors();
			} else if (menu.equals("3")) {
				System.out.println("\t** GAME WORLD CLOSED **");
				break;
			}
			else {
				System.out.println("\t** INVALID INPUT - TRY AGAIN **");
				System.out.println("=================================");
			}
		}
	}
	
}
