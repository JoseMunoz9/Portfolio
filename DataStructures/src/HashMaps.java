import java.util.HashMap;
import java.util.Scanner;

public class HashMaps {
	
	    //@Author Jose Munoz https://www.linkedin.com/in/jose-munoz90/
		//@Author Jose Munoz https://github.com/JoseMunoz9

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		HashMap<String, Integer> empID = new HashMap<>();
		
		// Adding elements to the map.
		empID.put("Jose", 2018385);
		empID.put("Max", 2018386);
		empID.put("Alex", 2018387);
		
		System.out.println("** Welcome to HashMap Class. This is our map of employees: **"
				+ "\n\t" + empID);
		System.out.println();
		System.out.println("> What would you like to do?");
		System.out.println("\t1. Get a particular employee ID.");
		System.out.println("\t2. Add an employee to the map.");
		System.out.println("\t3. Replace an ID.");
		System.out.println("\t4. Remove an employee.");
		
		String input1 = myScanner.nextLine();
		
		// While loop for validation.
		while (!input1.equals("1") && !input1.equals("2") && !input1.equals("3") && !input1.equals("4")) {
			System.out.println("\t***Select a number. Try again!***");
			input1 = myScanner.nextLine();
		}
		// Statements for the questions asked above.
		// ========================================================================
		// IF statements for this section (option one).
		// Get a particular employee ID
		if (input1.equals("1")) {
			System.out.println("Type in the employee's name: ");
			String input2 = myScanner.nextLine();
			
			// While loop validation for this section.
			while(!input2.equals("Jose") && !input2.equals("Max") && !input2.equals("Alex")) {
				System.out.println("\t***Type the correct name. Try again!***");
				input2 = myScanner.nextLine();
			}
			if (input2.equals("Jose")) {
				System.out.println("Employee ID is: " + empID.get(input2));
			} else if(input2.equals("Max")) {
				System.out.println("Employee ID is: " + empID.get(input2));
			} else if (input2.equals("Alex")) {
				System.out.println("Employee ID is: " + empID.get(input2));
			}
		}
		// ========================================================================
		// IF statements for this section (option two).
		// Add an employee to the map
			else if (input1.equals("2")) {
			System.out.println("> Type in the name you would like to add to the map:");
			String input3 = myScanner.nextLine();
			System.out.println("> What is the ID you'd like to add?");
			int input4 = myScanner.nextInt();
			empID.putIfAbsent(input3, input4); // To Add a new element to the map.
			System.out.println("> The updated map is: "
			+ "\n\t" + empID);
		} 
		// ========================================================================
		// IF statements for this section (option three).
		// Replace an ID
			else if (input1.equals("3")) {
			System.out.println("> Type in the name of the employee you'd like to replace: ");
			String input5 = myScanner.nextLine();
			
			while (!input5.equals("Jose") && !input5.equals("Max") && !input5.equals("Alex")) {
				System.out.println("\t***Type the correct name. Try again!***");
				input5 = myScanner.nextLine();
			}
			if (input5.equals("Jose")) {
				System.out.println("Type in the new ID: ");
				int replace = myScanner.nextInt();
				empID.replace("Jose", replace); // To replace the ID.
				System.out.println("> The updated map is: "
				+ "\n\t" + empID);
			} else if(input5.equals("Max")) {
				System.out.println("Type in the new ID: ");
				int replace = myScanner.nextInt();
				empID.replace("Max", replace);
				System.out.println("> The updated map is: "
				+ "\n\t" + empID);
			} else if (input5.equals("Alex")) {
				System.out.println("Type in the new ID: ");
				int replace = myScanner.nextInt();
				empID.replace("Alex", replace);
				System.out.println("> The updated map is: "
				+ "\n\t" + empID);
				}
		}
		// ========================================================================
		// IF statements for this section (option four).
		// Remove an employee
			else if (input1.equals("4")) {
			System.out.println("> Type in the name you'd like to remove: ");
			String input6 = myScanner.nextLine();
			
			while (!input6.equals("Jose") && !input6.equals("Max") && !input6.equals("Alex")) {
				System.out.println("\t***Type the correct name. Try again!***");
				input6 = myScanner.nextLine();
			}
			if (input6.equals("Jose")) {
				empID.remove("Jose"); // To remove an element.
				System.out.println("> The updated map is: "
				+ "\n\t" + empID);
			} else if (input6.equals("Max")) {
				empID.remove("Max");
				System.out.println("> The updated map is: "
				+ "\n\t" + empID);
			} else if (input6.equals("Alex")) {
				empID.remove("Alex");
				System.out.println("> The updated map is: "
				+ "\n\t" + empID);
			}
		}
		myScanner.close();
		System.out.println("===============================");
		System.out.println("** THIS IS HOW HASHMAPS WORK **");
		System.out.println("===============================");

	}

}

