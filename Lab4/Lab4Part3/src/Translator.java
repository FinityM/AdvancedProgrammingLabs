/***
 * Translates the text on the GUI to Spanish when JButton is pressed
 * @author mcledera
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;

public class Translator extends JFrame implements ActionListener {
    // ResourceBundle
    ResourceBundle res = ResourceBundle.getBundle("ProgramProperties_es");

    // Contentpane
    Container contentpane = getContentPane();

    // JLabels
    JLabel nine = new JLabel("Nine");
    JLabel eight = new JLabel("Eight");
    JLabel seven = new JLabel("Seven");
    JButton translate = new JButton("To Spanish");

    /**
     * Translator constructor
     */
    public Translator() {

        // JFrame content
        contentpane.add(nine);
        contentpane.add(eight);
        contentpane.add(seven);
        contentpane.add(translate);

        translate.addActionListener(this);

        setTitle("Translate");
        setVisible(true);
        setSize(500, 500);
        setLocation(400, 100);
        setLayout(new GridLayout(4, 1));

    }

    /**
     * Main method of the program
     * @param args
     */
    public static void main(String[] args) {
        ResourceBundle res = ResourceBundle.getBundle("ProgramProperties_es");
        System.out.println(res.getBaseBundleName());
        new Translator();
    }

    /**
     * Action performed of the JFrame to listren to the button
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == translate){
           nine.setText(res.getString("Nine"));
           eight.setText(res.getString("Eight"));
           seven.setText(res.getString("Seven"));
           translate.setText(res.getString("ToSpanish"));
       }


    }
}
