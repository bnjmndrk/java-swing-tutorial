package darkb.jswing.components.framepanel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

import darkb.jswing.components.toolbar.Toolbar;

/**
 * @author BDark
 * This class extends JSwing JFrame component and serves to abstract away the building of
 * our initial JFrame for our UI application.  
 *
 */
public class MainFrame extends JFrame {
	
	/**
	 * Add serial ID because JFrame is serializable
	 */
	private static final long serialVersionUID = -278976973183067048L;
	
	private TextPanel textPanel;
	private Toolbar toolbar;
	private JButton btn;
	private int count;
	
	public MainFrame() {
		super("Hello World");
		
		
		setLayout(new BorderLayout());
		toolbar = new Toolbar();
		btn = new JButton("Click Me!");
		textPanel= new TextPanel();
		count=0;
		/* 
		 * adding an anonymous action listener to this button, so every time it is selected, we can do something
		 * ActionListener is an interface, and we are implementing / overriding the 1 method of this,
		 * interface here.
		 */
		btn.addActionListener(new ActionListener() {		

			@Override
			public void actionPerformed(ActionEvent e) {
				count+=1;
				textPanel.getTextArea().append("You pressed the button " + count + " times\n");
			}
			
		});
		
		add(textPanel, BorderLayout.CENTER);
		add(toolbar, BorderLayout.NORTH);
		add(btn, BorderLayout.SOUTH);
		
		setSize(600, 500);											// give the app window some default size
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);	// exit application when window "X" is selected to close
		setVisible(true);
	}

}
