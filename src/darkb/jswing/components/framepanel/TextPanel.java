package darkb.jswing.components.framepanel;
import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * @author BDark
 * Custom JSwing Panel class which extends JPanel
 *
 */
public class TextPanel extends JPanel {

	/**
	 * Add serializable ID since JPanel is serializable
	 */
	private static final long serialVersionUID = 8319857714364493012L;
	private JTextArea textArea;

	public TextPanel() {
		textArea = new JTextArea();
		/*
		 * Create a border layout for our custom panel area
		 */
		setLayout(new BorderLayout());
		
		/*
		 * by adding the JScrollPane and passing in our textArea to the constructor, swing will 
		 * add the scroll bars to this and other comonents.
		 */
		add(new JScrollPane(textArea), BorderLayout.CENTER);
		
	}

	/**
	 * Method accepts new text string and appends it to the internal textArea component.
	 * @param input input text to append to our text area
	 */
	public void appendTxt(String input) {
		textArea.append(input);
	}
	
	
	/**
	 * Method retrieves the internal textArea component to allow for direct manipulation of the 
	 * textArea being displayed in this custom textPanel component.
	 * @return
	 */
	public JTextArea getTextArea() {
		return textArea;
	}
	
}
