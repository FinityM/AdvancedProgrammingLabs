public class VolumeCalculations {
    public static final double PI = 3.14159;

    public static void cylinderVolume(double radius, double height){
        double volume;
        volume = PI * (radius * radius) * height;

        System.out.println("Volume of this cylinder is: " + volume);

    }

    public static void coneVolume(double radius, double height){
        double volume;
        volume = PI * (radius * radius) * height/3;

        System.out.println("The volume of this cone is: " + volume);
    }

    public static void sphereVolume(double radius){
        double volume;
        volume = (4.0/3.0) * PI * (radius * radius * radius);

        System.out.println("The volume of this sphere is: " + volume);
    }
}
