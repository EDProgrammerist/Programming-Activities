import java.util.Scanner;

public class Activity16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the distance in cm: ");
        double cm = in.nextDouble();

        printInches(cm);
    }

    public static void printInches(double cm) {
        final double INCH_PER_CM = 0.393701;
        double inches = cm * INCH_PER_CM;
        System.out.printf("Distance of %.2f cms is = %.2f inches%n", cm, inches);
    }
}
