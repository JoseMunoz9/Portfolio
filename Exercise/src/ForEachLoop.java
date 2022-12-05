import java.util.ArrayList;

public class ForEachLoop {
	
	// @Author Jose Munoz https://www.linkedin.com/in/jose-munoz90/
	// @Author Jose Munoz https://github.com/JoseMunoz9

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		// Let's add some numbers to our ArrayLilst
		numbers.add(0);
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		
		// For Each loop to print our ArrayList
		// 'a' is our variable to call the ArrayList in the print statement.
		// This is what is happening between the For Each loop:
		// Each time we go through 'numbers' (which is our array) will create a new element 'a'.
		// Then we jump into the curly braces, we look at the first number in the array, which is '0'
		// and so we print it. Then we jump back to the FOR EACH loop that auto-increments to the next value
		// and we print it. - It will repeat the same process until the it reaches the end of the array.
		// This is how we read it: For each integer 'a', inside of 'numbers', we print out 'a'.
		for (int a : numbers) {
			System.out.println(a);
		}
		System.out.println("Another way of printing the ArrayList is using a regular (long) way 'for' loop:");
		// Another way of printing the ArrayList is using a regular (long way) 'for' loop.
		// We set the integer 'i' to 0, as long as 'i' is less than the length of the ArrayList,
		// 'i' increments by one each time.
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		// For Each loop looks a lot more cleaner and easier to read.
	}

}
