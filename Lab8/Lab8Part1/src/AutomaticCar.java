public class AutomaticCar extends Car{
    @Override
    public String changeGearInstructions() {
        String instruct = "Gear for " + this.getClass().getName() + "\n";
        String step1 = "Set gear stick to selected gear" + "\n";
        String step2 = "Car automatically cycles through the gears" + "\n";

        return instruct + step1 + step2;
    }
}
