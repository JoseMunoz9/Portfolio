import java.util.Scanner;

//@Author Jose Munoz https://www.linkedin.com/in/jose-munoz90/
//@Author Jose Munoz https://github.com/JoseMunoz9

public class Fibonacci {

	private static long[] fibonacciCache;
	
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		String name;
		String menu;
		int n = 92;
		
		fibonacciCache = new long[n + 1];
				
		boolean running = true;
		
		System.out.println("===========================================");
		System.out.println("** WELCOME TO THE FIBONACCI NUMBER CLASS **");
		System.out.println("===========================================");
		System.out.println();
		
		while (running) {
		System.out.println("Please enter your name:");
		name = myScanner.nextLine();
		
		boolean validFibonacci = false;
		do {
			System.out.println("Thanks, " + name + ". Now, enter the Fibonacci number you'd like to know:");
			Scanner myFibonacci = new Scanner(System.in);
			String fibonacci = myFibonacci.nextLine();	
			
			try {
				n = Integer.parseInt(fibonacci);
				validFibonacci = true;
				myFibonacci.close();
			} catch(Exception e) {
				System.out.println(name + ", you must enter an integer. Try again!");
			}
		} while(validFibonacci == false);
		
		System.out.println("Great, you have entered " + "'" + n + "'" + ". Here's the result:");
		
		for (int i = 0; i <= n; i++) {
			System.out.print(fibonacci(i) + " ");
			}
		System.out.println();
		System.out.println("******************************");
		System.out.println("What would you like to do now?");
		System.out.println("\t1. Let's do it again!");
		System.out.println("\t2. Exit the Fibonacci Class.");
		
		menu = myScanner.nextLine();
		
		while(!menu.equals("1") && !menu.equals("2")) {
			System.out.println("You must select one of the options above. Try again!");
			menu = myScanner.nextLine();
		}
		
		if(menu.equals("1")) {
			System.out.println("Here we go again!");
		} else if (menu.equals("2")) {
			System.out.println("Thanks for participating. Live TODAY, Love TOMORROW, UNITE FOREVER.");
			break;
			}
		}
		myScanner.close();
		System.out.println("=================================");
		System.out.println("** THIS IS HOW FIBONACCI WORKS **");
		System.out.println("=================================");
	}

	private static long fibonacci(int n) {
		if(n <= 1) {
			return n;
		}
		
		if(fibonacciCache[n] != 0) {
			return fibonacciCache[n];
		}
		long nthFibonacciNumber = (fibonacci(n - 1) + fibonacci(n - 2));
		fibonacciCache[n] = nthFibonacciNumber; 
		return nthFibonacciNumber;
		
	}

}
