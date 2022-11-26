package darkb.jswing.components.toolbar;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7793269521400005589L;
	private JButton helloBtn;
	private JButton goodbyeBtn;
	
	public Toolbar() {
		helloBtn = new JButton("Hello");
		goodbyeBtn = new JButton("Goodbye");
		
		/*
		 * Using flow layout to layout the buttons currently they will display in the center
		 */
		setLayout(new FlowLayout());
		
		add(helloBtn);
		add(goodbyeBtn);
		
	}

}
