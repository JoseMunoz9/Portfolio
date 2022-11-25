package Abstraction;

// @Author Jose Munoz https://www.linkedin.com/in/jose-munoz90/
// @Author Jose Munoz https://github.com/JoseMunoz9

public class Main {

	public static void main(String[] args) {
		
		Dog myDog = new Dog(); // Instantiation of Dog class.
		myDog.printName();
		myDog.printAge();
		myDog.makeNoise();
		myDog.poop();
		System.out.println("===========================");
		Cat myCat = new Cat(); // Instantiation of Cat class.
		myCat.printName();
		myCat.printAge();
		myCat.makeNoise();
		myCat.poop();

	}

}
