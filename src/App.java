import javax.swing.SwingUtilities;

import darkb.jswing.components.framepanel.MainFrame;

public class App {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){

			// for multi-thread safe swing applications, we need to run inside an
			// invokeLater - here I am doing this in an anonymous runnable class
			@Override
			public void run() {
				new MainFrame();	// create our main frame
			}
		
		});

	}

}
