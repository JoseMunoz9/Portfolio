import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuGUI extends JFrame implements ActionListener {
	
	// Basic menu box.

	public static void main(String[] args) {
		
	    new MenuGUI();

	}
	public MenuGUI () {
		
		// Setting up dimensions of the Menu Box.
		this.setSize(300, 300);
		this.setVisible(true);
		
		// Setting up the Menu Bar.
		
		JMenuBar myMenu = new JMenuBar ();
		this.setJMenuBar(myMenu);
		
		// Adding the options on the Menu Bar.
		
		JMenu file = new JMenu ("File");
		myMenu.add(file);
		
		JMenu subMenu = new JMenu ("Sub Menu");
		file.add(subMenu);
		
		// Setting up an Action Listener for the options on the Sub Menu to perform an Action.
		
		JMenuItem Gallery = new JMenuItem ("Gallery");
		subMenu.add(Gallery);
		Gallery.addActionListener(this);
		Gallery.setActionCommand("Gallery");
		
		JMenuItem ContactME = new JMenuItem ("Contact Me");
		subMenu.add(ContactME);
		ContactME.addActionListener(this);
		ContactME.setActionCommand("Contact Me");
		
		JMenuItem Close = new JMenuItem("CLOSE");
		file.add(Close);
		Close.addActionListener(this);
		Close.setActionCommand("Close");
		
		JMenu leave = new JMenu ("Leave");
		myMenu.add(leave);
		
		JMenuItem subClose = new JMenuItem ("Leave Site");
		leave.add(subClose);
		subClose.addActionListener(this);
		subClose.setActionCommand("Leave Site");
		
		this.validate();
		this.repaint();

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// Conditional statements for the Action Listeners.
		
		String ac = e.getActionCommand ();
		
		if (ac.equals("Close")) {
			System.out.println("You have closed this window.");
			System.exit(0);
		}
		else if (ac.equals("Leave Site")) {
			System.out.println("You have left this site. Thanks for visiting!");
			System.exit(0);
		}
		else if (ac.equals ("Gallery")) {
			System.out.println("Gallery has been clicked!");
		}
		else if (ac.equals("Contact Me")) {
			System.out.println("josemunoz@guitest.com");
		}
		else {
			System.out.println("Action has been performed!");
		}
	}

}
