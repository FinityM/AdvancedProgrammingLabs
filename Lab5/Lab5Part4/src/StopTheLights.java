import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StopTheLights extends JFrame implements Runnable, ActionListener {
    Container container = getContentPane();
    JPanel btnPanel = new JPanel();
    JButton start = new JButton("Start");
    JButton stop = new JButton("Stop");

    int distance = 90;
    int lightsHeight = 40;

    Color redLight = Color.BLACK;
    Color yellowLight = Color.BLACK;
    Color greenLight = Color.BLACK;

    static boolean on_off = true;

    static StopTheLights trafficLight = new StopTheLights();
    static Thread thread = new Thread(trafficLight);

    public static void main(String[] args) {

    }


    public StopTheLights() {
        btnPanel.add(start);
        btnPanel.add(stop);

        start.addActionListener(this);
        stop.addActionListener(this);

        setVisible(true);
        setSize(250, 400);
        setLocation(700, 250);
        container.add(btnPanel, BorderLayout.SOUTH);
        container.setBackground(Color.BLACK);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == start) {
            System.out.println("After pressing start: " + on_off);
            on_off = true;
            thread.start();
        }

        if (e.getSource() == stop) {
            System.out.println("After pressing stop: " + on_off);
            on_off = false;
        }

    }

    @Override
    public void run() {
        Graphics g = getGraphics();
        System.out.println("After get graphics in run method: " + on_off);
        try {
            System.out.println("Inside try statement: " + on_off);
            while (on_off) {
                System.out.println("Inside while loop: " + on_off);
                Thread.sleep(600);
                g.setColor(Color.RED);
                g.fillRoundRect(80, lightsHeight, 80, 80, 70, 70);

                Thread.sleep(700);
                g.setColor(Color.YELLOW);
                g.fillRoundRect(80, lightsHeight + distance, 80, 80, 70, 70);

                Thread.sleep(800);
                g.setColor(Color.GREEN);
                g.fillRoundRect(80, lightsHeight + 2 * distance, 80, 80, 70, 70);

                Thread.sleep(600);
                g.setColor(Color.BLACK);
                g.fillRoundRect(80, lightsHeight, 80, 80, 70, 70);

                Thread.sleep(700);
                g.setColor(Color.BLACK);
                g.fillRoundRect(80, lightsHeight + distance, 80, 80, 70, 70);

                Thread.sleep(800);
                g.setColor(Color.BLACK);
                g.fillRoundRect(80, lightsHeight + 2 * distance, 80, 80, 70, 70);
                repaint();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(redLight);
        g.fillRoundRect(80, lightsHeight, 80, 80, 70, 70);

        g.setColor(yellowLight);
        g.fillRoundRect(80, lightsHeight + distance, 80, 80, 70, 70);

        g.setColor(greenLight);
        g.fillRoundRect(80, lightsHeight + 2 * distance, 80, 80, 70, 70);

    }
}
