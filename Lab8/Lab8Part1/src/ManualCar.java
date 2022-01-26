public class ManualCar extends Car{
    @Override
    public String changeGearInstructions() {
        String instruct = "Gear for " + this.getClass().getName() + "\n";
        String step1 = "Step on the clutch" + "\n";
        String step2 = "Select the gear" + "\n";
        String step3 = "Release the clutch" + "\n";

        return instruct + step1 + step2 + step3;
    }
}
