import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

/**
 * 
 */

/**
 * @author mcledera
 *
 */
public class TestForExceptionsGUI extends JFrame implements ActionListener {
	// The contentpane
	Container contentpane = getContentPane();

	// 4 buttons
	JButton button1 = new JButton("Test IO Exception");
	JButton button2 = new JButton("Test Null Pointer Exception");
	JButton button3 = new JButton("Test URL Exception");
	JButton button4 = new JButton("Test General Exception");

	// Button panel
	JPanel panel = new JPanel();

	public TestForExceptionsGUI() {
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);

		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);

		contentpane.add(panel);
		setSize(500, 500);
		setVisible(true);

	}
	
	/**
	 * @param str for reading strings
	 * @param filename for reading filenames
	 * @param url for reading url's 
	 * @param generalExceptionActivated for activating the general Exception
	 * 
	 * 
	 */
	
	public void testException(String str, String filename, String url, boolean generalExceptionActivated) {
		try {
			str.toCharArray(); // Null string potential error
			new FileReader(filename); // Unknown filename potential error
			new URL(url); // Badly written URL potential error
			if (generalExceptionActivated) { // Potential error
				this.clone(); // Will be caught as a general error!
			}

		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(this, "A null object has been passed to the method " + e.getMessage(),
					"IOException", JOptionPane.WARNING_MESSAGE);

		} catch (MalformedURLException e) {
			JOptionPane.showMessageDialog(this, "The message passed is not correctly formatted " + e.getMessage(),
					"IOException", JOptionPane.WARNING_MESSAGE);

		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "There has been an Input/Output error " + e.getMessage(), "IOException",
					JOptionPane.WARNING_MESSAGE);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "An unidentified error has occured " + e.getMessage(), "IOException",
					JOptionPane.WARNING_MESSAGE);

		}

		finally {
			// TODO: handle finally clause
			JOptionPane.showMessageDialog(this, "The finally block has been called ", "IOException",
					JOptionPane.WARNING_MESSAGE);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestForExceptionsGUI();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button1) {
			testException("Hi", "Whatever.txt", "http://www.itb.ie", false);

		} else if (e.getSource() == button2) {
			testException(null, "Real.txt", "http://www.itb.ie", false);

		} else if (e.getSource() == button3) {
			testException("Hi", "Real.txt", "ht//www.itb.ie", false);

		} else if (e.getSource() == button4) {
			testException("Hi", "Real.txt", "http://www.itb.ie", true);

		}

	}

}
