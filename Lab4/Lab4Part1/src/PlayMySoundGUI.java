import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

/***
 * Simple sound GUI
 * @author mcledera
 *
 */

public class PlayMySoundGUI extends JFrame implements ActionListener {
    File file = new File("InceptionFogHorn.wav");

    // Declare the contentpane
    Container contentpane = getContentPane();
    JButton play = new JButton("Play");
    JButton loop = new JButton("Loop");
    JButton stop = new JButton("Stop");

    // Declare the clip as a global variable
    Clip theClip;

    /**
     * Creates the JFrame
     * @throws UnsupportedAudioFileException
     * @throws IOException
     * @throws LineUnavailableException
     */
    public PlayMySoundGUI() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        // Initialise the clip to the getSound method
        theClip = getSound(file);

        // Action listener's for buttons
        play.addActionListener(this);
        stop.addActionListener(this);
        loop.addActionListener(this);

        // JFrame content
        contentpane.add(play);
        contentpane.add(stop);
        contentpane.add(loop);

        setTitle("The sound");
        setVisible(true);
        setSize(500, 500);
        setLocation(400, 100);
        setLayout(new GridLayout(3, 1));
    }

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        new PlayMySoundGUI();
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        // Was unable to figure out how to use the file ONCE only

        if (theClip.isOpen()) {

            if (event.getSource() == play) {
                // Play the clip
                theClip.start();

            } else if (event.getSource() == loop) {
                // Loop the clip
                theClip.loop(Clip.LOOP_CONTINUOUSLY);

            } else if (event.getSource() == stop) {
                // Stop the clip
                theClip.stop();

            }
        }
    }


    /***
     *
     * @param file finds the file from the project directory
     * @return the file as a clip
     * @throws UnsupportedAudioFileException throws unsupported files error
     * @throws IOException throws IOException error
     * @throws LineUnavailableException throws error if line cannot be opened
     */
    public Clip getSound(File file) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        // Get file from project directory
        System.out.println(file.toURI().toString());

        // Declare the Audio input class and print out the stream
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(file);
            // Get a sound clip resource
            Clip clip = AudioSystem.getClip();

            // Open audio clip and load samples from input stream.
            clip.open(audioIn);

            return clip;
    }
}
