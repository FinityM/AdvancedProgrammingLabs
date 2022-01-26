import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Part1 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("myFavTeam.txt"))) {
            System.out.println(reader.readLine());
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}

