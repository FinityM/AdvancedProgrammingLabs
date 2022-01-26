public class TestCalculation {
    public static void main(String[] args) {

        // Declare the shapes
        double coneRadius = 6, coneHeight = 10;
        double cylinderRadius = 4, cylinderHeight = 9;
        double sphereRadius = 5;

        // Print out the value of PI
        System.out.println("The value of PI: " + VolumeCalculations.PI);

        // Calculate the volume of the shapes making use of the
        VolumeCalculations.coneVolume(coneRadius, coneHeight);
        VolumeCalculations.cylinderVolume(cylinderRadius, cylinderHeight);
        VolumeCalculations.sphereVolume(sphereRadius);


    }
}
