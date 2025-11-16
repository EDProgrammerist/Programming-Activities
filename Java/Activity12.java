import java.util.Scanner;

public class Activity12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the first number: ");
        double x = input.nextDouble();

        System.out.print("Input the second number: ");
        double y = input.nextDouble();

        double result = divide(x, y); 

        if (y != 0) {
            System.out.println("The division is: " + result);
        } else {
            System.out.println("Division is not possible");
        }

        input.close(); 
    }

    public static double divide(double a, double b) {
        return a / b;
    }
}
