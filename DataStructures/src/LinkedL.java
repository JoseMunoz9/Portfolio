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
						   "\n> Choose one name: ");
		String input = myLinkedList.nextLine();
		// =========================================================================
		if (input.equals("Jose")) {
			System.out.println("** Jose says you are a great person! What would you like to do? **");
			System.out.println("1. Remove this element from the list.");
			System.out.println("2. Let Jose know he is great.");
			
			String in = myLinkedList.nextLine();
			
			while(!in.equals("1") && !in.equals("2")) {
				System.out.println("Invalid input. Try again!");
				in = myLinkedList.nextLine();
			}
				if(in.equals("1")) {
				myLinkedL.remove(0);
				System.out.println("** Jose has been removed from the list. The updated list is: **");
				System.out.println(myLinkedL);
				} else if(in.equals("2")) {
				System.out.println("** Jose says THANK YOU! **");
					}

			} 
				// =========================================================================
				else if(input.equals("Max")) {
				System.out.println("** You have chosen Max. What would you like to do? **");
				System.out.println("1. Remove this element from the list.");
				System.out.println("2. Let Max know he is great.");
				String in = myLinkedList.nextLine();
				
				while (!in.equals("1") && !in.equals("2")) {
					System.out.println("Invalid input. Try again!");
					in = myLinkedList.nextLine();
				}
					if (in.equals("1")) {
					myLinkedL.remove(1);
					System.out.println("** Max has been removed from the list. The updated list is: **");
					System.out.println(myLinkedL);
					} else if(in.equals("2")) {
					System.out.println("** Max says THANK YOU! **");
					}
				} 
				// =========================================================================
				else if(input.equals("Alex")) {
				System.out.println("** You have chosen Alex. What would you like to do? **");
				System.out.println("1. Remove this element from the list.");
				System.out.println("2. Let Max know he is great.");
				String in = myLinkedList.nextLine();
				
				while (!in.equals("1") && !in.equals("2")) {
					System.out.println("Invalid input. Try again!");
					in = myLinkedList.nextLine();
				}
					if (in.equals("1")) {
					myLinkedL.remove(2);
					System.out.println("** Alex has been removed from the list. The updated list is: **");
					System.out.println(myLinkedL);
					} else if (in.equals("2")) {
					System.out.println("** Alex says THANK YOU! **");
				}
			}
		myLinkedList.close();
	}
}
