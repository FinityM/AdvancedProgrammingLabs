/**
 * Program that translates text on the GUI back and forth, also populates JTextArea with the available Calendar locales
 *
 * @author mcledera
 *
 * Encountered issues:
 * Make sure property files do not end up associating as a bundle, the way to get the bundle will be different which
 * I don't know how to set in IntelliJ
 * Syntax error leading to me not being able to find it due to the size of the program,
 * Version control will be important because using an older version of this code fixed my issue
 *
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Locale;
import java.util.ResourceBundle;

public class FullTranslationGUI extends JFrame implements ActionListener {
    // Declare the locales
    Locale eng = new Locale("en","GB");
    Locale fr = new Locale("fr", "FR");
    Locale setLocale = eng;

    // Getting the resource bundle from the properties file
    ResourceBundle res = ResourceBundle.getBundle("ResourceProperty", setLocale);

    // String array for the countries
    String[] countries = {res.getString("countryEN"), res.getString("countryFR")};

    // List of available calendar locales
    Locale[] locales = Calendar.getAvailableLocales();

    // The contentpane
    Container contentpane = getContentPane();

    // JPanel for each section
    JPanel comboBoxPanel = new JPanel();
    JPanel textAreaPanel = new JPanel();
    JPanel buttonPanel = new JPanel();

    // More JFrame components
    JLabel label = new JLabel(res.getString("labelTag"));
    JButton button = new JButton(res.getString("buttonTag"));
    JTextArea textArea = new JTextArea();
    JComboBox<String> language = new JComboBox<>(countries);
    JScrollPane taScroll = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

    public FullTranslationGUI() {
        // Default language is English which is in index 0 of the countries array
        language.setSelectedIndex(0);

        // Other component settings
        textArea.setEditable(false);
        textAreaPanel.setLayout(new GridLayout(2,1));

        // Action listener for the button and combobox
        button.addActionListener(this);
        language.addActionListener(this);

        // The Panels
        comboBoxPanel.add(language);
        textAreaPanel.add(label);
        textAreaPanel.add(taScroll);
        buttonPanel.add(button);

        // Add panels to contentpane
        contentpane.add(comboBoxPanel);
        contentpane.add(textAreaPanel);
        contentpane.add(buttonPanel);

        // JFrame methods to set
        setTitle("Full translating GUI");
        setVisible(true);
        setSize(500, 500);
        setLocation(400, 100);
        setLayout(new GridLayout(3, 1));

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button){
            // Combobox will translate the button
            if (language.getSelectedIndex() == 0){
                setLocale = eng;
                System.out.println("If statement to set to English");
                System.out.println("The locale in this if statement is: " + setLocale);
                translateGUI(setLocale);

            } else if (language.getSelectedIndex() == 1){
                setLocale = fr;
                System.out.println("If statement to set to French");
                System.out.println("The locale in this if statement is: " + setLocale);
                translateGUI(setLocale);
            }

        }
    }

    /***
     * Method to translate the text into the other language and remove the combobox content to add it again
     * @param setLocale
     */
    public void translateGUI(Locale setLocale){
        ResourceBundle res = ResourceBundle.getBundle("ResourceProperty", setLocale);
        language.removeAllItems();

        label.setText(res.getString("labelTag"));
        button.setText(res.getString("buttonTag"));

        language.addItem(res.getString("countryEN"));
        language.addItem(res.getString("countryFR"));

        for (int iterate = 0; iterate < locales.length; iterate++){
            String theCalendarLocales = locales[iterate].getDisplayName(setLocale);
            textArea.append("\n" + theCalendarLocales);
            System.out.println(theCalendarLocales);
        }

    }
}
