import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputFormFrame {
    JFrame frame;
    JLabel label;
    JButton submit;
    JTextField textField;

    public InputFormFrame(){
        frame = new JFrame();
        RegisterPanel regPanel = new RegisterPanel();
        frame.add(regPanel);
        frame.setTitle("Not yet submitted");
        frame.setLayout(new GridLayout(2,2));
        frame.setVisible(true);
        frame.setSize(500, 200);

    }

    class RegisterPanel extends JPanel{

        RegisterPanel(){
            label = new JLabel("Enter a Name: ");
            textField = new JTextField(10);
            submit = new JButton("Submit");
            submit.addActionListener(new SubmitResponder());
            add(label);
            add(textField);
            add(submit);
        }

    }

    class SubmitResponder implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            frame.setTitle("Submit Completed!");
            textField.setEditable(false);
        }
    }

    public static void main(String[] args) {
        new InputFormFrame();
    }
}
