import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

//@Author Jose Munoz https://www.linkedin.com/in/jose-munoz90/
//@Author Jose Munoz https://github.com/JoseMunoz9

public class SwapButton extends JFrame implements ActionListener {
	
	JTextField one;
	JTextField two;

	public static void main(String[] args) {
		new SwapButton();
	}
	
	public SwapButton() {
		
		// Setting up the dimensions, Border and Panel of the window.
		
		this.setSize(300,300);
		this.setVisible(true);
		
		BorderLayout outer = new BorderLayout();
		this.setLayout(outer);
		
		JPanel panel = new JPanel ();
		this.add(panel);
		
		// Setting up the size of the Text Field.
		
		one = new JTextField(15);
		two = new JTextField(15);
		
		// Adding the Text onto the panel.
		
		panel.add(one);
		panel.add(two);
		
		// Setting up the button to swap the Text Field and the Action Listener to perform the action.
		
		JButton button = new JButton ("Swap");
		this.add(button, BorderLayout.SOUTH);
		button.addActionListener(this);
		button.setActionCommand("button");
		
		this.validate();
		this.repaint();
	}
	
	// Here we are setting up the conditions to perform an action (to swap the text).
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String variable = e.getActionCommand ();
		if (variable.equals("button")) {
			String text1 = one.getText();
			String text2 = two.getText();
			one.setText(text2);
			two.setText(text1);
		}
	}

}
