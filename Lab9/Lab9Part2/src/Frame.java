import javax.swing.*;
import java.awt.*;
import java.util.Locale;
import java.util.ResourceBundle;;

public class Frame extends JFrame {
    Container container = getContentPane();
    JLabel label = new JLabel("This label shows a sentence");
    JButton english = new JButton("English");
    JButton italian = new JButton("Italian");
    JButton tagalog = new JButton("Filipino");
    JPanel labelPanel = new JPanel();
    JPanel buttonPanel = new JPanel();

    public Frame(){
        setTitle("More Translations");
        setSize(500, 400);
        setVisible(true);
        container.setLayout(new GridLayout(3,1));

        labelPanel.add(label);
        buttonPanel.add(english);
        buttonPanel.add(italian);
        buttonPanel.add(tagalog);
        container.add(labelPanel);
        container.add(buttonPanel);

        english.addActionListener(e -> {
            Locale l = new Locale("en", "EN");
            ResourceBundle r = ResourceBundle.getBundle("resources.languages",l);
            label.setText(r.getString("label"));

        });

        italian.addActionListener(e -> {
            Locale l = new Locale("it", "IT");
            ResourceBundle r = ResourceBundle.getBundle("resources.languages",l);
            label.setText(r.getString("label"));
        });

        tagalog.addActionListener(e -> {
            Locale l = new Locale("ph", "PH");
            ResourceBundle r = ResourceBundle.getBundle("resources.languages",l);
            label.setText(r.getString("label"));
        });
    }



    public static void main(String[] args) {
        new Frame();
    }

}
