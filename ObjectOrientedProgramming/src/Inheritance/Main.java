package Inheritance;

// @Author Jose Munoz https://www.linkedin.com/in/jose-munoz90/
// @Author Jose Munoz https://github.com/JoseMunoz9

public class Main {

	public static void main(String[] args) {
		
		// Instantiation of our classes.
		Vehicles v = new Vehicles();
		Cars car = new Cars();
		Trucks truck = new Trucks();
		Motorcycles motor = new Motorcycles();
		
		// Calling methods from different classes within the same project.
		car.setColor("Black");
		car.sport();
		truck.setColor("Blue");
		motor.setColor("Black");
		v.engine();
		v.tyres();

	}

}
