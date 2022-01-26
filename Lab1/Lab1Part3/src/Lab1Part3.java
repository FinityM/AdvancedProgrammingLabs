
/**
 * 
 */

/**
 * @author mcledera
 *
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.plaf.*;

// Import for the factorial method inside of a package
import Mathematics.MathHelper;

public class Lab1Part3 extends JFrame implements ActionListener {

	// Variables for the JFrame GUI
	Container contentpane = getContentPane();
	JLabel enter = new JLabel("Enter a number to summate or factor: ");
	JLabel calculated = new JLabel("Answer will appear here");
	JTextField theNumber = new JTextField(20);
	JButton summation = new JButton("Summation");
	JButton factor = new JButton("Factorial");
	JPanel buttonPanel = new JPanel();
	JPanel textPanel = new JPanel();

	public Lab1Part3() {
		theNumber.setPreferredSize(new DimensionUIResource(50, 50));
		buttonPanel.add(summation);
		buttonPanel.add(factor);
		textPanel.add(enter);
		textPanel.add(theNumber);
		textPanel.add(calculated);
		contentpane.add(textPanel);
		contentpane.add(buttonPanel);

		summation.addActionListener(this);
		factor.addActionListener(this);

		setSize(800, 300);
		setVisible(true);
		setLayout(new GridLayout(2, 1));
		setLocation(400, 300);

	}

	/**
	 * @param args to execute main method
	 */

	public static void main(String[] args) {
		new Lab1Part3();

	}

	// Action performed to calculate the number
	@Override
	public void actionPerformed(ActionEvent e) {

		// First if statement to carry out Summation
		if (e.getSource() == summation) {
			// Check if button works
			System.out.println("Value has been summated");

			// Changing the string to an int from the textfield
			String value = theNumber.getText();
			int valToSummate = Integer.parseInt(value);

			// Change label and supply calculated answer
			calculated.setText("Answer: " + Lab1Part1.recursiveSummation(valToSummate));

		}
		// Second if statement to carry out the Factorial method
		else if (e.getSource() == factor) {
			// Check if button works
			System.out.println("Value has been factored");

			// Changing the string to an int from the textfield
			String value = theNumber.getText();
			int valToFactor = Integer.parseInt(value);

			// Change label and supply calculated answer
			calculated.setText("Answer: " + MathHelper.recursiveFactorial(valToFactor));
		}

	}

}
