
public class ForLoop {
	// @Author Jose Munoz https://www.linkedin.com/in/jose-munoz90/
	// @Author Jose Munoz https://github.com/JoseMunoz9
	
	public static void main(String[] args) {
		// Array of Strings
		String[] animals = {"Dog", "Cat", "Lion"};
		
		// Regular (long) way of a FOR loop.
		// We start at index 0, while index is less than the length of our string array,
		// index increments by one each time.
		System.out.println("Regular FOR loop:");
		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);
		}
		System.out.println("FOR EACH loop to do exactly the same thing as a FOR loop.");
		// FOR EACH loop to do exactly the same thing as a FOR loop.
		// For each string 'animal' inside of 'animals' we print out 'animal'.
		for (String animal : animals) {
			System.out.println(animal);
		}
	}

}
