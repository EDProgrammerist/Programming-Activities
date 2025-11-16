import java.util.Scanner;

public class Activity5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to input x1 and y1
        System.out.print("Input x1: ");
        double x1 = input.nextDouble();
        System.out.print("Input y1: ");
        double y1 = input.nextDouble();

        // Prompt the user to input x2 and y2
        System.out.print("Input x2: ");
        double x2 = input.nextDouble();
        System.out.print("Input y2: ");
        double y2 = input.nextDouble();

        // Calculate and display the distance between the two points
        double distance = distanceBetweenPoints(x1, y1, x2, y2);
        System.out.printf("Distance between the said points: %.4f\n", distance);
    }

    // Method to compute Cartesian distance
    public static double distanceBetweenPoints(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
