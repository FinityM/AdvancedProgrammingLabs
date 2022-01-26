import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LightPanel extends JPanel implements ActionListener {

    DrawTrafficLight drawTrafficLight = new DrawTrafficLight();
    Thread changingLights = new Thread(drawTrafficLight);

    JButton start = new JButton("Start");
    JButton stop = new JButton("Stop");

    public LightPanel(){

        drawTrafficLight.setPreferredSize(new Dimension(160,260));

        start.addActionListener(this);

        add(drawTrafficLight);
        add(start);
        add(stop);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == start){
            drawTrafficLight.setOn_off(true);
            changingLights.start();
            System.out.println(changingLights);

        }
        else if (e.getSource() == stop){
            changingLights.interrupt();

        }

    }
}
