// import java.awt.print.Book;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queues {
	
	// @Author Jose Munoz https://www.linkedin.com/in/jose-munoz90/
	// @Author Jose Munoz https://github.com/JoseMunoz9

	public static void main(String[] args) {
		
		// First-In Fist-Out: FIFO = Queue
		// Linear Data Structure
		// To add an element to the Queue: enqueue, offer();
		// To remove an element from the Queue: dequeue, poll();
		
		Scanner myQueue = new Scanner(System.in);
		Queue<String> books = new LinkedList<String>();
		
		books.add("Dracula");
		books.add("The Complete Grimoire");
		books.add("The Vampire Diaries");
		
		boolean running = true;
		
		// books.remove(); // To remove an element.
		// books.size(); // To check the size of the queue.
		// books.contains(""); // To check if an element is in the Queue.
		
		System.out.println("** Welcome to the Library **");
		System.out.println("These are the books we have: "
						   + "\n" + books);
			while (running) {
				System.out.println("> What would you like to do?");
				System.out.println("\t1. Select a book.");
				System.out.println("\t2. Check if a particular book is in the Library.");
				System.out.println("\t3. Check the total books in the Library.");
				System.out.println("\t4. Remove a book from the Queue.");
				System.out.println("\t5. Add a book the Queue.");
				
				String input1 = myQueue.nextLine();
				
				// While loop for validation.
				while (!input1.equals("1") && !input1.equals("2") && !input1.equals("3")
						&& !input1.equals("4") && !input1.equals("5")) {
					System.out.println("** You need to select a number from the options. **");
					input1 = myQueue.nextLine();
				}
				// ================================================================================
				if (input1.equals("1")) {
					System.out.println("> Type in the name of the book you'd like to pick:");
					String input2 = myQueue.nextLine();
					
					while (!input2.equals("Dracula") && !input2.equals("The Complete Grimoire")
							&& !input2.equals("The Vampire Diaries")) {
						System.out.println("** It seems like there is a misspelling. Try again! **");
						input2 = myQueue.nextLine();
						}
						
						if (input2.equals("Dracula")) {
							books.remove(input2); // To remove an element from the Queue.
							System.out.println("> You have selected: " + input2);
						} else if (input2.equals("The Complete Grimoire")) {
							books.remove(input2); // To remove an element from the Queue.
							System.out.println("> You have selected: " + input2);
						} else if (input2.equals("The Vampire Diaries")) {
							books.remove(input2); // To remove an element from the Queue.
							System.out.println("> You have selected: " + input2);
					}
				}
					// ================================================================================
					else if (input1.equals("2")) {
					System.out.println("> Type in the name of the book: ");
					String input3 = myQueue.nextLine();
					books.contains(input3); // To check for an element in the Queue.
					
					if (!input3.equals("Dracula") && !input3.equals("The Complete Grimoire")
							&& !input3.equals("The Vampire Diaries")) {
						System.out.println(">" + input3 + " is not in our system.");
					}
				}
				// ================================================================================
				else if (input1.equals("3")) {
					System.out.println("> The total of books is: " + books.size());
				}
				// ================================================================================
				else if (input1.equals("4")) {
					System.out.println("> Type in the name you'd like to remove from the Queue: ");
					String input4 = myQueue.nextLine();
					
					while (!input4.equals("Dracula") && !input4.equals("The Complete Grimoire") &&
							!input4.equals("The Vampire Diaries")) {
						System.out.println("** It seems like there is a misspelling. Try again! **");
						input4 = myQueue.nextLine();
					}
					if (input4.equals("Dracula")) {
						books.remove(input4); // To remove an element from the Queue.
						System.out.println("\t# " + input4 + " has been removed from the Queue."
								+ "\n The updated list is: " + "\n" + books);
					} else if (input4.equals("The Complete Grimoire")) {
						books.remove(input4); // To remove an element from the Queue.
						System.out.println("\t# " + input4 + " has been removed from the Queue."
								+ "\n The updated list is: " + "\n" + books);
					} else if (input4.equals("The Vampire Diaries")) {
						books.remove(input4); // To remove an element from the Queue.
						System.out.println("\t# " + input4 + " has been removed from the Queue."
								+ "\n The updated list is: " + "\n" + books);
					}
				}
				// ================================================================================
				else if (input1.equals("5")) {
					System.out.println("> Type in the name of the book you'd like to add: ");
					String input5 = myQueue.nextLine();
					books.add(input5); // To add an element to the Queue.
					System.out.println("\t#" + input5 + " has been added to the Queue.");
					System.out.println("\t# The updated list is: "
							+ "\n" + books);
				}
				// ================================================================================
				System.out.println("================================================");
				System.out.println("What would you like to do now?");
				System.out.println("\t1. Continue in the library.");
				System.out.println("\t2. Exit the Library.");
				String input6 = myQueue.nextLine();
				
				while (!input6.equals("1") && !input6.equals("2")) {
					System.out.println("You must select a number from the options given above.");
					input6 = myQueue.nextLine();
				}
				if (input6.equals("1")) {
					System.out.println("You continue in the Library.");
					System.out.println("The updated Queue is: " +
									   "\n" + books);
				} else if (input6.equals("2")) {
					System.out.println("You have left the Library successfully.");
					break;
				}
	}
			myQueue.close();
			System.out.println("===============================");
			System.out.println(" ** THIS IS HOW QUEUES WORK ** ");
			System.out.println("===============================");

}
}
