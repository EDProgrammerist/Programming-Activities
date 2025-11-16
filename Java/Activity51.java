import java.util.Scanner;

public class Activity51 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input distance in meters: ");
        int distance = scanner.nextInt();

        calculateFare(distance);

        scanner.close();
    }

    public static void calculateFare(int distance) {
        double fare = 20.0; 

        if (distance > 300) {
            int extraDistance = distance - 300;
            int extraSegments = (extraDistance + 199) / 200; 
            fare += extraSegments * 2.0;
        }

        System.out.println("Total fare: P" + fare);
    }
}
