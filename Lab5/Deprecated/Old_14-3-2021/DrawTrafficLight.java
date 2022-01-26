import javax.swing.*;
import java.awt.*;

public class DrawTrafficLight extends JComponent implements Runnable {
    static Color redLight = Color.BLACK;
    static Color orangeLight = Color.BLACK;
    static Color greenLight = Color.BLACK;

    public static Color[] lights = {redLight, orangeLight, greenLight};

    public boolean on_off;

    public void paint(Graphics g){
        g.setColor(Color.GRAY);
        g.fillRect(0,0,150,250);

        g.setColor(Color.BLACK);
        g.drawRect(0,0,150,250);

        g.setColor(redLight);
        g.fillOval(50,30,50,50);

        g.setColor(orangeLight);
        g.fillOval(50,100,50,50);

        g.setColor(greenLight);
        g.fillOval(50,170,50,50);
    }

    @Override
    public void run() {

        greenLight = Color.BLACK;
        orangeLight = Color.BLACK;
        redLight = Color.BLACK;

        try {
            while (on_off){
                redLight = Color.RED;
                Thread.sleep(500);

                redLight = Color.BLACK;
                repaint();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public boolean isOn_off() {
        return on_off;
    }

    public void setOn_off(boolean on_off) {
        this.on_off = on_off;
    }

    public Color getRedLight() {
        return redLight;
    }

    public void setRedLight(Color redLight) {
        this.redLight = redLight;
    }

    public Color getOrangeLight() {
        return orangeLight;
    }

    public void setOrangeLight(Color orangeLight) {
        this.orangeLight = orangeLight;
    }

    public Color getGreenLight() {
        return greenLight;
    }

    public void setGreenLight(Color greenLight) {
        this.greenLight = greenLight;
    }
}
