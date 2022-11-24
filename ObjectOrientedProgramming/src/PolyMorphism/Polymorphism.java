package PolyMorphism;
// @Author Jose Munoz https://www.linkedin.com/in/jose-munoz90/
// @Author Jose Munoz https://github.com/JoseMunoz9

public class Polymorphism {

	public static void main(String[] args) {
		
		Animal myAnimal = new Animal();
		
		myAnimal.eat();
		
		Dog myDog = new Dog();
		myDog.eat(3);
		
		Cat myCat = new Cat();
		myCat.eat();

	}

}
