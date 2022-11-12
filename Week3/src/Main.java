import interfaces.Luxury;
import model.A3;
import model.Corolla;
import model.Fiesta;
import model.Focus;
import model.Ford;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Focus fo1 = new Focus("Red"); // Luxury Family
		Corolla c1 = new Corolla("Blue"); // Luxury
		Fiesta fi1 = new Fiesta("Yellow"); // Sport
		A3 a31 = new A3("Grey"); // Sport
		
		System.out.println(fo1);
		System.out.println(c1);
		System.out.println(fi1);
		System.out.println(a31);
		
		Ford[] myFords = new Ford[3];
		myFords[0] = fo1;
		myFords[1] = fi1;
		
		Luxury[] myLuxuryCars = new Luxury[2];
		myLuxuryCars[0] = fo1;
		myLuxuryCars[1] = c1;
		
		for(Luxury cars : myLuxuryCars) {
			cars.chillChampagne();
		}

	}

}
