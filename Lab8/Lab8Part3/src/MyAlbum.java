import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Vector;

public class MyAlbum {
    Vector<AlbumItem> vector = new Vector<>();
    JFrame frame = new JFrame();
    JPanel imgPanel = new JPanel();
    JPanel textPanel = new JPanel();
    JPanel buttonPanel = new JPanel();
    JLabel image;
    JLabel fact;
    JButton next = new JButton("Next");
    JButton previous = new JButton("Previous");
    ImageIcon imageIcon = new ImageIcon(new ImageIcon("images/Border-Collie.jpg").getImage().getScaledInstance(200, 200, BufferedImage.SCALE_DEFAULT));

    int index = 0;

    public void fill_Vec() {
        vector.add(new FavouriteAnimal("images/Border-Collie.jpg", "Border Collie's are the smartest breed of dog"));
        vector.add(new FavouriteAnimal("images/monke.jpg", "King Kong is a Big Monke"));
        vector.add(new FavouriteAnimal("images/smilinggodzilla.jpg", "Godzilla is just a Spicy Iguana"));
        vector.add(new FavouriteAnimal("images/DragonPasswordFINAL.jpg", "Dragons can breath fire"));
        vector.add(new FavouriteAnimal("images/Unicorn.jpg", "Unicorns like impaling people"));
        vector.add(new FavouriteSport("images/cycling.jpg", "Cycling helps build strong legs"));
        vector.add(new FavouriteSport("images/esports.jpg", "Esports is one of the largest sports growing"));
        vector.add(new FavouriteSport("images/Exercise.jpg", "Exercising helps improve fitness"));
        vector.add(new FavouriteSport("images/running.jpg", "Running burns a lot of calories and helps improve your stamina"));
        vector.add(new FavouriteSport("images/Swimming.jpg", "Swimming in the cold does have some benefits for improving immunity"));
    }

    public MyAlbum() throws ArrayIndexOutOfBoundsException {
        fill_Vec();
        frame.setLayout(new GridLayout(3, 1));
        image = new JLabel(imageIcon);
        fact = new JLabel("Border Collie's are the smartest breed of dog");
        fact.setBounds(10, 120, 400, 200);
        image.setBounds(150, 10, 300, 300);
        next.setBounds(350, 190, 80, 20);
        previous.setBounds(70, 190, 80, 20);
        imgPanel.add(image);
        textPanel.add(fact);
        buttonPanel.add(next);
        buttonPanel.add(previous);
        frame.add(imgPanel);
        frame.add(textPanel);
        frame.add(buttonPanel);
        frame.setLocation(200, 200);
        frame.setSize(600, 500);
        frame.setVisible(true);

        next.addActionListener(e -> {
            try {
                if (index <= vector.size())
                    index++;
                else
                    index = 0;
                ImageIcon imgVar1 = new ImageIcon(new ImageIcon(vector.get(index).getImage()).getImage().getScaledInstance(200, 200, BufferedImage.SCALE_DEFAULT));
                image.setIcon(imgVar1);
                fact.setText(vector.get(index).getDesc());

            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Error caused by extra image");
                exception.printStackTrace();
            }


        });

        previous.addActionListener(e -> {
            try {
                if (index >= 0)
                    index--;
                else
                    index = vector.size();
                ImageIcon imgVar2 = new ImageIcon(new ImageIcon(vector.get(index).getImage()).getImage().getScaledInstance(200, 200, BufferedImage.SCALE_DEFAULT));
                image.setIcon(imgVar2);
                fact.setText(vector.get(index).getDesc());

            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Error caused by extra image");
                exception.printStackTrace();

            }


        });

    }

    public static void main(String[] args) {
        new MyAlbum();
    }

}
