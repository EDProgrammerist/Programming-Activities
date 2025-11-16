import java.util.Scanner;

public class Activity40 {

    public static float getArea(float side) {
        return side * side; 
    }

    // Main function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME TO NICO’S COMPUTING AREA OF THE SQUARE PROGRAM");

        System.out.print("Input side: ");
        float side = scanner.nextFloat();

        float area = getArea(side); 

        System.out.printf("Output: the area is : %.2f%n", area); 
    }
}
