import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

//@Author Jose Munoz https://www.linkedin.com/in/jose-munoz90/
//@Author Jose Munoz https://github.com/JoseMunoz9

public class CalculatorGUI extends JFrame {
	
	// Very simple GUI Calculator that does not perform any mathematical operation.

	public static void main(String[] args) {
		
		new CalculatorGUI ();

	}
	public CalculatorGUI () {
		
		// Setting up the dimensions and title of the Calculator box.
		
		this.setVisible(true);
		this.setSize(300, 500);
		this.setTitle("GUI Calculator");
		
		// Setting up the BorderLayout.
		
		BorderLayout outer = new BorderLayout ();
		this.setLayout(outer);
		
		JTextField screen = new JTextField();
		this.add(screen, BorderLayout.NORTH);
		
		// Adding the buttons onto the Border.
		
		JPanel buttons = new JPanel();
		this.add(buttons, BorderLayout.CENTER);
		
		BorderLayout inner = new BorderLayout();
		buttons.setLayout(inner);
		
		// Setting up the panel for the buttons.
		
		JPanel memoryButtons = new JPanel ();
		buttons.add(memoryButtons, BorderLayout.NORTH);
		
		// Creating the memory buttons.
		
		JButton mc = new JButton ("MC");
		memoryButtons.add(mc);
		JButton mr = new JButton("MR");
		memoryButtons.add(mr);
		JButton mp = new JButton("MP");
		memoryButtons.add(mp);
		JButton mm = new JButton("MM");
		memoryButtons.add(mm);
		JButton ms = new JButton("MS");
		memoryButtons.add(ms);
		JButton mPower = new JButton("mPower");
		memoryButtons.add(mPower);
		
		JPanel innerCentre = new JPanel ();
		buttons.add(innerCentre, BorderLayout.CENTER);
		
		// Setting up the Grid for calculator and its numbers.
		
		GridLayout Grid = new GridLayout (3,4);
		innerCentre.setLayout(Grid);
		
		JButton one = new JButton ("1");
		innerCentre.add(one);
		JButton two = new JButton ("2");
		innerCentre.add(two);
		JButton three = new JButton ("3");
		innerCentre.add(three);
		JButton four = new JButton ("4");
		innerCentre.add(four);
		JButton five = new JButton ("5");
		innerCentre.add(five);
		JButton six = new JButton ("6");
		innerCentre.add(six);
		JButton seven = new JButton ("7");
		innerCentre.add(seven);
		JButton eight = new JButton ("8");
		innerCentre.add(eight);
		JButton nine = new JButton ("9");
		innerCentre.add(nine);
		JButton zero = new JButton ("0");
		innerCentre.add(zero);
		JButton ans = new JButton ("ANS");
		innerCentre.add(ans);
		JButton equal = new JButton ("=");
		innerCentre.add(equal);
		
		this.validate();
		this.repaint();
		
	}

}
