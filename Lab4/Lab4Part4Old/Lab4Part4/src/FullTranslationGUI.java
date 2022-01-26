import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * No issues with sequencing...
 * Make sure property files do not end up associating as a bundle, the way to get the bundle will be different which
 * I don't know how to set in IntelliJ
 *
 */
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
    JTextArea textArea = new JTextArea(20, 20);
    JComboBox<String> language = new JComboBox<>(countries);

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
        textAreaPanel.add(textArea);
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

        // Change the JTextArea content with the button
        if (e.getSource() == button) {
            System.out.println("Translate my suffering");
        }
    }

    /***
     * Method to translate the text into the other language
     * @param setLocale
     */
    public void translateGUI(Locale setLocale){
        ResourceBundle res = ResourceBundle.getBundle("ResourceProperty", setLocale);

        label.setText(res.getString("labelTag"));
        button.setText(res.getString("buttonTag"));

        language.removeAllItems();
        language.addItem(res.getString("countryEN"));
        language.addItem(res.getString("countryFR"));

    }
}
