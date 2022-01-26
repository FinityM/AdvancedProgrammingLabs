import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIWithAnonymousInnerClass extends JFrame {
    JPanel panel = new JPanel();
    JButton btn = new JButton("Button");
    JLabel lbl = new JLabel("Label");

    public static void main(String[] args) {
        new GUIWithAnonymousInnerClass();
    }

    public GUIWithAnonymousInnerClass() {
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Class<?> anonymousClass = this.getClass();
                if (e.getSource() == btn) {
                    System.out.println(anonymousClass);
                    lbl.setText("Inner class has set the outer label, name of inner class that did this: " + anonymousClass.getName());
                }


            }
        });
        panel.add(btn);
        panel.add(lbl);
        add(panel);
        setSize(300, 300);
        setVisible(true);
        setLocation(500, 250);


    }
}
