import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LambdaGUI extends JFrame implements ActionListener {

    JPanel pnl = new JPanel();
    JButton btn = new JButton("Button");
    JLabel lbl = new JLabel("Press the button to see current class with lambda");

    public static void main(String[] args) {
        new LambdaGUI();
    }

    public LambdaGUI(){

        btn.addActionListener(e -> {
            try {
                Class lambdaClass = Class.forName("LambdaGUI");

                if (e.getSource() == btn ){
                    lbl.setText("Name of the class: " + lambdaClass.getName());
                }
            } catch (ClassNotFoundException classNotFoundException) {
                classNotFoundException.printStackTrace();
            }

        });

        pnl.add(lbl);
        pnl.add(btn);
        add(pnl);

        setVisible(true);
        setSize(500,500);
        setLocation(500, 200);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
