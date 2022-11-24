package Encapsulation;

import java.util.Scanner;

// @Author Jose Munoz https://www.linkedin.com/in/jose-munoz90/
// @Author Jose Munoz https://github.com/JoseMunoz9

public class Main {

	public static void main(String[] args) {
		Scanner myEncapsul = new Scanner(System.in);
		Student s = new Student(); // Instantiation of the Student class.
		// Here we are setting the Name, profession, nationality and age for our variables in the
		// Student class. Then, we can use the 'get' method to get a particular info we need
		// from each variable.
		s.setName("Jose Munoz");
		s.setProfession("Junior Developer");
		s.setNationality("Salvadoran");
		s.setAge(31);
		
		System.out.println("** Welcome to the 'Encapsulation' class! **");
		System.out.println("** We have one student in our class. **");
		System.out.println("=======================================");
		boolean running = true;
		while (running) {
			System.out.println("> What would you like to know?");
			System.out.println("\t1. The name of the student.");
			System.out.println("\t2. The age of the student.");
			System.out.println("\t3. The nationality of the student.");
			System.out.println("\t4. The profession of the student.");
			String encapsul = myEncapsul.nextLine();
			
			// While loop for validation, in case the user's input is not valid.
			while (!encapsul.equals("1") && !encapsul.equals("2") && !encapsul.equals("3") &&
					!encapsul.equals("4")) {
				System.out.println("** You need to select a number from the menu! **");
				encapsul = myEncapsul.nextLine();
			}
			// 'If' statements (conditions) for each option from the menu.
			if (encapsul.equals("1")) {
				// Here we are getting the info we need from the student class.
				// Using the method 'get': s.getName, s.getAge, etc.
				System.out.println("The student's name is: " + s.getName());
			} else if (encapsul.equals("2")) {
				System.out.println("The student's age is: " + s.getAge());
			} else if (encapsul.equals("3")) {
				System.out.println("The student's nationality is: " + s.getNationality());
			} else if (encapsul.equals("4")) {
				System.out.println("The student's profession is: " + s.getProfession());
			}
			System.out.println("> Would you like to continue in the class?");
			System.out.println("\t1. Yes");
			System.out.println("\t2. No");
			String menu = myEncapsul.nextLine();
			
			// While loop for validation, in case the user's input is not valid.
			while (!menu.equals("1") && !menu.equals("2")) {
				System.out.println("** You have to select a number from the options above! **");
				menu = myEncapsul.nextLine();
			}
			// 'If' statements (conditions) for each option from the menu.
			if (menu.equals("1")) {
				System.out.println("<< You can select another option of the menu. >>");
			} else if (menu.equals("2")) {
				System.out.println("<< You have left the class! >>");
				break;
			}
		}
		myEncapsul.close();
		System.out.println("=====================================");
		System.out.println("** THIS IS HOW ENCAPSULATION WORKS **");
		System.out.println("=====================================");

	}

}
