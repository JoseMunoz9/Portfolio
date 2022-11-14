import java.util.Random;
import java.util.Scanner;

public class AdventureGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		Random myRandom = new Random();
		
		// Game variables
		String[] enemies = {"Witch", "Vampire", "Hunter", "Lycan"}; // String Array of the enemies.
		int maxEnemyHealth = 75; // Max healthy these enemies can possibly have.
		int enemyAttackD = 25; // Attack damage to our character.
		
		// Player variables
		int health = 100;
		int attackD = 50; // How much damage we can do to our enemies.
		int numHealthP = 3; // Health recovery (potions) if our character is low in health.
		int healthPHealAmount = 30; // The amount of health the potion heals for.
		int healthPDropChance = 50; // 50% chance to drop a health potion for the enemies.
		
		boolean running = true; // Part of a while loop. The game will keep running over and over until some conditions are met.
		
		System.out.println("Welcome to the Dungeon!");
		
		GAME: // We are setting the while loop's name as GAME
			while(running) {
				System.out.println("-----------------------------------------------");
				
				int enemyHealth = myRandom.nextInt(maxEnemyHealth);
				
				// with this line of code we are going to access the list of enemies randomly.
				String enemy = enemies[myRandom.nextInt(enemies.length)];
				System.out.println("\t# " + enemy + " has appeared! #\n");
				
				while (enemyHealth > 0) {
					System.out.println("\tYour HP: " + health);
					System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
					System.out.println("\n\tWhat would you like to do?");
					System.out.println("\t1. Attack");
					System.out.println("\t2. Drink health potion");
					System.out.println("\t3. Run");
					
					String input = userInput.nextLine();
					
					if(input.equals("1")) {
						int damageDealt = myRandom.nextInt(attackD);
						int damageTaken = myRandom.nextInt(enemyAttackD);
						
						enemyHealth -= damageDealt;
						health -= damageTaken;
						
						System.out.println("\t> You strike the " + enemy + " for " + damageDealt + " damage.");
						System.out.println("\t> You receive " + damageTaken + " in retaliation!");
						
						if (health < 1) {
							System.out.println("\t> You have taken too much damage. You are too weak to go on!");
							break;
						}
					} else if (input.equals("2")) {
						if (numHealthP > 0) {
							health += healthPHealAmount;
							numHealthP--;
							System.out.println("\t> You drink a health potion, healing yourself for " + healthPHealAmount + "."
												+ "\n\t> You now have " + health + " HP."
												+ "\n\t> You have " + numHealthP + " health potions left.\n");
						}
						else {
							System.out.println("\t> You have no health potions left! Defeat enemies for a chance to get one.\n");
						}
					} else if (input.equals("3")) {
						System.out.println("\tYou run away from the " + enemy + "!");
						
						// with this line of code we are going back to the start of the game to generate
						// a new enemy and start the combat again.
						// GAME is the name of the main while loop.
						continue GAME;
					}
					else {
						System.out.println("\tInvalid input!");
					}
				}
				if (health < 1) {
					System.out.println("You limp out of the Dungeon, weak from battle.");
					break;
				}
				
				System.out.println("--------------------------------------------------");
				System.out.println(" # " + enemy + " was defeated! # ");
				System.out.println(" # You have " + health + " HP left. # ");
				
				if (myRandom.nextInt(100) < healthPDropChance) {
					numHealthP++;
					System.out.println(" # The " + enemy + " dropped a health potion! # ");
					System.out.println("# You now have " + numHealthP + " health potion(s). # ");
				}
				System.out.println("---------------------------------------------------");
				System.out.println("What would you like to do now?");
				System.out.println("1. Continue fighting");
				System.out.println("2. Exit the Dungeon");
				
				String input = userInput.nextLine();
				
				while(!input.equals("1") && !input.equals("2")) {
					System.out.println("Invalid input!");
					input = userInput.nextLine();
				}
				
				if(input.equals("1")) {
					System.out.println("You continue on your fights!");
				} else if(input.equals("2")) {
					System.out.println("You exit the Dungeon successful from your fight!");
					break;
				}
				userInput.close();
			}
		System.out.println("#######################");
		System.out.println("# THANKS FOR PLAYING! #");
		System.out.println("#######################");
	}

}
