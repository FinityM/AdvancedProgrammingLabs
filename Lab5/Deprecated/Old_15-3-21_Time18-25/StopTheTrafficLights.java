import javax.swing.*;
import java.awt.*;

public class StopTheTrafficLights extends JFrame {
    JPanel primePanel = new JPanel();
    JPanel buttonPanel = new JPanel();

    JButton start = new JButton("Start");
    JButton stop = new JButton("Stop");

    TrafficLights lights = new TrafficLights();

    public static void main(String[] args) {
        StopTheTrafficLights jframe = new StopTheTrafficLights();


    }

    public StopTheTrafficLights(){

        primePanel.add(lights);
        buttonPanel.add(start);
        buttonPanel.add(stop);
        add(primePanel);
        add(buttonPanel, BorderLayout.SOUTH);
        setTitle("The Traffic Light");
        setSize(250,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocation(700, 250);
    }

    class TrafficLights extends JPanel{
        int value = 0;
        int distance = 90;
        int lightsHeight = 10;

        Color redLight = Color.RED;
        Color yellowLight = Color.BLACK;
        Color greenLight = Color.BLACK;

        TrafficLights(){

        }

        public void recursionPaint(Graphics g){
            paint(g);
        }

        public void changeValue(){
            if (value == 25){
                value = -1;
            }
            value += 1;
        }

        public void changeLight(){
            if (value == 0){
                yellowLight = Color.BLACK;
                redLight = Color.RED;
            }

            if (value == 10){
                redLight = Color.BLACK;
                yellowLight = Color.BLACK;
                greenLight = Color.GREEN;
            }

            if (value == 15){
                greenLight = Color.BLACK;
                yellowLight = Color.YELLOW;
            }
            repaint();
        }

        public void paint(Graphics g){
            g.setColor(redLight);
            g.fillRoundRect(80, lightsHeight, 80, 80, 70,70);

            g.setColor(yellowLight);
            g.fillRoundRect(80, lightsHeight + distance, 80, 80, 70,70);

            g.setColor(redLight);
            g.fillRoundRect(80,lightsHeight + 2 * distance, 80, 80, 70,70);
        }
    }
}

