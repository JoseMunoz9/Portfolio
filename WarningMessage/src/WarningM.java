import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//@Author Jose Munoz https://www.linkedin.com/in/jose-munoz90/
//@Author Jose Munoz https://github.com/JoseMunoz9

public class WarningM extends JFrame{

	public static void main(String[] args) {
		new WarningM();

	}
	public WarningM() {
		
		// Setting up the dimension of the window.
		
		this.setVisible(true);
		this.setSize(300,300);
		
		// This is how we can set up a warning message.
		
		JOptionPane.showMessageDialog(this, "Warning! You're about to see a message.", "Terrible",
				JOptionPane.WARNING_MESSAGE);
		
		// This is how we can set up an ERROR message.
		
		JOptionPane.showMessageDialog(this, "Try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
		
		// This is how we can set up a Question pop-up.
		
		int n = JOptionPane.showConfirmDialog(this, "Do you want to leave this page?", "Important Q.",
				JOptionPane.YES_NO_OPTION);
				JOptionPane.showMessageDialog(this, n);
				
				String[] options = {"Yes", "No"};
				
				int m = JOptionPane.showOptionDialog(this, "Click here to see a message", "Leave",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
				JOptionPane.showMessageDialog(this, m);
				
				// This is how we can set up options in a pop-up window.
				
				String[] possibilities = {"One", "Two", "Three"};
				
				String s = (String)JOptionPane.showInputDialog(this, "What is your lucky number?", "Random",
						JOptionPane.PLAIN_MESSAGE, null, possibilities, possibilities[0]);
				JOptionPane.showMessageDialog(this, s + " is my lucky number.");
				
				String st = (String) JOptionPane.showInputDialog(this, "What is your lucky number?",
						"Customized Dialog", JOptionPane.PLAIN_MESSAGE, null, null, null);
				JOptionPane.showMessageDialog(this, s + " is my lucky number.");
				
				// This is how we can look up for a file in our computer.
				
				JFileChooser fs = new JFileChooser();
				fs.showOpenDialog(this);
				File file = fs.getSelectedFile();
				System.out.println(file);
		
		this.validate();
		this.repaint();
	}

}
