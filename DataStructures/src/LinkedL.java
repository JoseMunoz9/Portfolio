import java.util.LinkedList;
import java.util.Scanner;

public class LinkedL {
	
	//@Author Jose Munoz https://www.linkedin.com/in/jose-munoz90/
	//@Author Jose Munoz https://github.com/JoseMunoz9

	public static void main(String[] args) {
		
		Scanner myLinkedList = new Scanner(System.in);
		
		LinkedList myLinkedL = new LinkedList();
		
		myLinkedL.add("Jose");
		myLinkedL.add("Max");
		myLinkedL.add("Alex");
		
		System.out.println("** Welcome to the LinkedList project! **");
		System.out.println("----------------------------------------");
		System.out.println("This is the list we have: " + myLinkedL +
						   "\n> What would you like to do?: ");
		System.out.println("\t1. Choose a name from the list.");
		System.out.println("\t2. Add a name to the list.");
		
		// String input1 is the main variable for the first set of questions asked above.
		String input1 = myLinkedList.nextLine();
		// =========================================================================
		// While loop for validation, that way we make sure the user enters a valid input.
		while (!input1.equals("1") && !input1.equals("2")) {
			System.out.println("> Invalid input. Try again!");
			input1 = myLinkedList.nextLine();
		}
		// If the user selects the first option from the set of questions asked above,
		// then we do the following.
		// Conditionals, IF and WHILE for validation of valid inputs.
		if (input1.equals("1")) {
			System.out.println("Type in the chosen name: ");
			
			// String in2 is the variable for the input asked in this section.
			String in2 = myLinkedList.nextLine();
			
			// While loop for validation.
			while (!in2.equals("Jose") && !in2.equals("Max") && !in2.equals("Alex")) {
				System.out.println("Invalid input. Try again!");
				in2 = myLinkedList.nextLine();
			}
			if (in2.equals("Jose")) {
				System.out.println("> You have chosen Jose! What would you like to do?");
				System.out.println("\t1. Remove this element from the list.");
				System.out.println("\t2. Let Jose know he is great.");
				
				// String in3 is the variable for the set of questions asked in this section.
				String in3 = myLinkedList.nextLine();
				
				while(!in3.equals("1") && !in3.equals("2")) {
					System.out.println("Invalid input. Try again!");
					in3 = myLinkedList.nextLine();
				}
					if(in3.equals("1")) {
					myLinkedL.remove(0);
					System.out.println("> Jose has been removed from the list. The updated list is:");
					System.out.println(myLinkedL);
					} else if(in3.equals("2")) {
					System.out.println("==============================");
					System.out.println("**** Jose says THANK YOU! ****");
					System.out.println("==============================");
						}
			}
			// =========================================================================
			// String in2 is the variable for the input asked in this section.
			else if(in2.equals("Max")) {
				System.out.println("> You have chosen Max. What would you like to do?");
				System.out.println("\t1. Remove this element from the list.");
				System.out.println("\t2. Let Max know he is great.");
				
				// String in3 is the variable for the set of questions asked in this section.
				String in3 = myLinkedList.nextLine();
				
				while (!in3.equals("1") && !in3.equals("2")) {
					System.out.println("Invalid input. Try again!");
					in3 = myLinkedList.nextLine();
				}
					if (in3.equals("1")) {
					myLinkedL.remove(1);
					System.out.println("> Max has been removed from the list. The updated list is:");
					System.out.println(myLinkedL);
					} else if(in3.equals("2")) {
					System.out.println("==============================");
					System.out.println(" **** Max says THANK YOU! ****");
					System.out.println("==============================");
					}
			}
			// =========================================================================
			// String in2 is the variable for the input asked in this section.
			else if(in2.equals("Alex")) {
				System.out.println("> You have chosen Alex. What would you like to do?");
				System.out.println("\t1. Remove this element from the list.");
				System.out.println("\t2. Let Alex know he is great.");
				
				// String in3 is the variable for the set of questions asked in this section.
				String in3 = myLinkedList.nextLine();
				
				while (!in3.equals("1") && !in3.equals("2")) {
					System.out.println("Invalid input. Try again!");
					in3 = myLinkedList.nextLine();
				}
					if (in3.equals("1")) {
					myLinkedL.remove(2);
					System.out.println("** Alex has been removed from the list. The updated list is: **");
					System.out.println(myLinkedL);
					} else if (in3.equals("2")) {
					System.out.println("==============================");
					System.out.println("**** Alex says THANK YOU! ****");
					System.out.println("==============================");
				}
			}
		}
		// String input1 is the main variable for the first set of questions asked at the beginning.
		if (input1.equals("2")) {
			System.out.println("Type a name: ");
			
			// String in4 is the variable for the input asked above.
			String in4 = myLinkedList.nextLine();
			myLinkedL.add(in4);
			System.out.println("> The updated list is: " +
							   "\n" + myLinkedL);
		}
		myLinkedList.close();
		System.out.println("==============================");
		System.out.println("** THANKS FOR PARTICIPATING **");
		System.out.println("==============================");
	}
}
