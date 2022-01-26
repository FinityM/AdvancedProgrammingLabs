import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIWithInnerClassHandler extends JFrame {
    public ButtonHandler handler = new ButtonHandler();
    JPanel panel = new JPanel();
    JButton btn = new JButton("Button");
    JLabel lbl = new JLabel("Label");

    public static void main(String[] args) {
        new GUIWithInnerClassHandler();
    }

    public GUIWithInnerClassHandler(){
        btn.addActionListener(handler);
        panel.add(btn);
        panel.add(lbl);
        add(panel);
        setSize(300,300);
        setVisible(true);
        setLocation(500,250);


    }

    public class ButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                Class classReflect = Class.forName("GUIWithInnerClassHandler$ButtonHandler");

                if (e.getSource() == btn){
                    lbl.setText("Inner class has set the outer label, name of inner class that did this: " + classReflect.getName());
                }

            } catch (ClassNotFoundException classNotFoundException) {
                classNotFoundException.printStackTrace();
            }

        }
    }
}
