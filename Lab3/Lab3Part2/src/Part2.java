import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Part2 extends JFrame implements ActionListener {
    // An array called stringArray with A, B and C
    String[] stringArray = {"A", "B", "C"};

    // The contentpane
    Container contentpane = getContentPane();

    // JButton called inputButton
    JButton inputButton = new JButton("Press this to get content of array");

    // JLabel to output contents of array
    JLabel infoInput = new JLabel("Please input index number of array to get output of that index");
    JLabel infoOutput = new JLabel("Output will appear here");
    JLabel outputLabel = new JLabel();

    //JPanels for to organise button and labels
    JPanel labelPanel = new JPanel();
    JPanel buttonPanel = new JPanel();

    // Text field for the input of the array
    JTextField inputField = new JTextField(20);

    public Part2() {
        // Listener for the button
        inputButton.addActionListener(this);

        // Label panel
        labelPanel.add(infoInput);
        labelPanel.add(inputField);
        labelPanel.add(infoOutput);
        labelPanel.add(outputLabel);

        labelPanel.setLayout(new GridLayout(4, 1));

        // Button panel
        buttonPanel.add(inputButton);

        // Contentpane
        contentpane.add(labelPanel);
        contentpane.add(buttonPanel);
        contentpane.setLayout(new GridLayout(2, 1));

        // JFrame
        setSize(500, 500);
        setLocation(400, 100);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Part2();
    }

    /**
     * Method for the GUI action events and the JOptionpane behaviour
     *
     * @param e the action event
     */

    @Override
    public void actionPerformed(ActionEvent e) {
        // Typecast the entered number to an int
        int inputNum = Integer.parseInt(inputField.getText());
        if (e.getSource() == inputButton) {
            try {
                outputLabel.setText(stringArray[inputNum]);

            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Exception caught");
                while (inputNum >= stringArray.length) {

                    // Get the string from the input dialog
                    String correctInput = JOptionPane.showInputDialog(this, "You attempted to access beyond the array bounds please try again");

                    // Convert the string from the input dialog into an int
                    int withinArray = Integer.parseInt(correctInput);

                    // Check if the input is less then the array and end the code
                    if (withinArray < stringArray.length) {
                        outputLabel.setText(stringArray[withinArray]);
                        break;
                    }
                }
            }
        }
    }
}


