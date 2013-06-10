package com.forex_trading_calculator.applet;

import javax.swing.*;
import java.awt.*;

/**
 * @author Andrei Kolosok
 */
public class GraphApplet extends JApplet{

	public void init() {

		try {
			javax.swing.SwingUtilities.invokeAndWait(new Runnable() {
				public void run() {
					createGUI();
				}
			});
		} catch (Exception e) {
			System.err.println("createGUI didn't successfully complete");
		}
	}

	private void createGUI() {
		JLabel label = new JLabel(
				"You are successfully running a Swing applet!");
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBorder(BorderFactory.createMatteBorder(1,1,1,1, Color.black));
		getContentPane().add(label, BorderLayout.CENTER);
	}

	public static void main(String[] args)
	{
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());/*"com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"*/
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		// create the frame with a title
		Frame frame = new Frame();
		frame.setTitle("Test");
		// exit the application when the JFrame is closed
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		// set the size of the frame (applet will be width by height in size)
		int height = 300;
		int width = 450;
		// pack the frame to get correct insets
		frame.pack();
		Insets fI = frame.getInsets();
		frame.setSize(width + fI.right + fI.left, height + fI.top + fI.bottom);
		// center the frame on screen
		Dimension sD = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation((sD.width - width)/3, (sD.height - height)/3);
		// make the frame visible
		frame.setVisible(true);
	}
}
