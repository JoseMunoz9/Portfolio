import java.util.Scanner;

//@Author Jose Munoz https://www.linkedin.com/in/jose-munoz90/
//@Author Jose Munoz https://github.com/JoseMunoz9

public class RockPaperScissors {
	
	private String name;
	private int age;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RockPaperScissors();
	}
	
	RockPaperScissors(){
		Scanner myGame = new Scanner(System.in);
		
		System.out.println("Please, enter your name: ");
		name = myGame.nextLine();
		
		System.out.println("Thanks, " + name + ". Please, enter your age.");
			

}
}
