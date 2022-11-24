package PolyMorphism;

import java.util.Scanner;

// @Author Jose Munoz https://www.linkedin.com/in/jose-munoz90/
// @Author Jose Munoz https://github.com/JoseMunoz9

public class Polymorphism {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		// This is the main class and from here we can call a parent class, as well as a child class.
		Animal myAnimal = new Animal(); // Parent class.
		Dog myDog = new Dog(); // Child class.
		Cat myCat = new Cat(); // Child class.
		
		System.out.println("** Welcome to Polymorphism Class **");
		boolean running = true;
		while (running) {
			System.out.println("> What would you like to know?");
			System.out.println("\t1. What are the animals available in this package?");
			System.out.println("\t2. What do these animals eat?");
			System.out.println("\t3. What are the names of the animals in this package?");
			String input = myScanner.nextLine();
			
			while (!input.equals("1") && !input.equals("2") && !input.equals("3")) {
				System.out.println("** You have to choose a number from the options above! **");
				input = myScanner.nextLine();
			}
			if (input.equals("1")) {
				System.out.println("> The animals available in this package are: ");
				myAnimal.type();
			} else if (input.equals("2")) {
				System.out.println("> These animals eat the following: ");
				myDog.eat(3); // 'eat' is our method in the parent class 'Animal'.
				myCat.eat();
			} else if (input.equals("3")) {
				System.out.println("> The names are: ");
				myDog.name(); // 'name' is our method in both of child classes.
				myCat.name();
			}
			
			System.out.println("> What would you like to do now?");
			System.out.println("\t1. Continue in the class.");
			System.out.println("\t2. Exit the class.");
			String input2 = myScanner.nextLine();
			
			while (!input2.equals("1") && !input2.equals("2")) {
				System.out.println("** You need to choose a number from the options above. **");
				input2 = myScanner.nextLine();
			}
			if (input2.equals("1")) {
				System.out.println("** You stay in the class! **");
			} else if (input2.equals("2")) {
				System.out.println("\t<< You have left the class >>");
				break;
			}
		}
		myScanner.close();
		System.out.println("====================================");
		System.out.println("** THIS IS HOW POLYMORPHISM WORKS **");
		System.out.println("====================================");
	}

}
