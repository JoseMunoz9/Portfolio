import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//@Author Jose Munoz https://www.linkedin.com/in/jose-munoz90/
//@Author Jose Munoz https://github.com/JoseMunoz9

public class LoginSystem implements ActionListener{
	
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passLabel;
	private static JPasswordField passText;
	private static JButton button;
	private static JLabel success;

	public static void main(String[] args) {
		
		// Creating Panel and Frame box
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		
		panel.setLayout(null);
		
		// Creating the User's text field with its dimensions
		
		userLabel = new JLabel("User");
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);
		
		userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		// Creating the Password text field with its dimensions
		
		passLabel = new JLabel("Password");
		passLabel.setBounds(10, 50, 80, 25);
		panel.add(passLabel);
		
		passText = new JPasswordField(20);
		passText.setBounds(100, 50, 165, 25);
		panel.add(passText);
		
		// Creating the Login button and success message
		
		button = new JButton("Login");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new LoginSystem()); // The ActionListener will tell the computer whether the credentials are correct
		// or not and will also give the appropriate message to the user.
		panel.add(button);
		
		success = new JLabel("");
		success.setBounds(10, 110, 300, 25);
		panel.add(success);

	}
	
	// Here the computer will tell the user whether the login has been successful or not.

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String user = userText.getText();
		String password = passText.getText();
		
		if(user.equals("Jose") && password.equals("covid19")) {
			success.setText("Login successful!");
		}
		else {
			success.setText("Incorrect user and/or password.");
			
		}
		
	}

}
