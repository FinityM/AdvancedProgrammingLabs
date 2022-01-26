import javax.swing.*;

public class StopTheLights extends JFrame {
    LightPanel lightPanelPanel = new LightPanel();

    public StopTheLights() {
        add(lightPanelPanel);
        setSize(250, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new StopTheLights();
    }
}
