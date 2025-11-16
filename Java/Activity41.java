import java.util.Scanner;

public class Activity41 {

    public static float getArea(float length, float width) {
        return length * width;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME TO NICO’S COMPUTING AREA OF THE RECTANGLE PROGRAM");

        System.out.print("Input length: ");
        float length = scanner.nextFloat();

        System.out.print("Input width: ");
        float width = scanner.nextFloat();

        float area = getArea(length, width);

        System.out.printf("Output: the area is : %.2f%n", area);

        scanner.close();
    }
}
