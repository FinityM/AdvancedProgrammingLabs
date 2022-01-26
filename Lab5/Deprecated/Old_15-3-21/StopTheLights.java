import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class StopTheLights extends JFrame implements ActionListener, Runnable {

    Color redLight = Color.RED;
    Color orangeLight = Color.ORANGE;
    Color greenLight = Color.GREEN;

    // Declare a vector array for the Colors so that they are synchronized by default
    Vector<Color> colors = new Vector<>();

    private JButton startButton;
    private JButton stopButton;
    private JPanel mainPanel;
    private JPanel btnPanel;

    public StopTheLights(){
        //mainPanel.add(btnPanel);
        mainPanel.setBackground(Color.BLACK);
        add(mainPanel);
        setTitle("Traffic Light");
        setSize(300, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g){
        colors.add(redLight);
        colors.add(orangeLight);
        colors.add(greenLight);

        g.setColor(Color.GRAY);
        g.fillRect(100,30,150,250);

        g.setColor(Color.BLACK);
        g.drawRect(100,30,150,250);

        g.setColor(redLight);
        g.fillOval(150,60,50,50);

        g.setColor(orangeLight);
        g.fillOval(150,130,50,50);

        g.setColor(greenLight);
        g.fillOval(150,200,50,50);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        StopTheLights startLights = new StopTheLights();

        if (e.getSource() == startButton){
            while (true){
                new Thread(startLights).start();
            }

        }

    }


    @Override
    public void run() {
        try {
            while (true){
                Thread.sleep(300);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
