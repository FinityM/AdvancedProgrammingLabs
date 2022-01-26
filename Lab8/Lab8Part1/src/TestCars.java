import java.util.Vector;

public class TestCars {
    public static void main(String[] args) {
        Car auto = new AutomaticCar();
        Car manual = new ManualCar();

        Vector<Car> cars = new Vector<>();

        cars.add(auto);
        cars.add(manual);

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.elementAt(i).changeGearInstructions());

        }

    }
}
