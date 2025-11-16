import java.util.Scanner;

public class Activity19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the first integer: ");
        int number1 = input.nextInt();

        System.out.print("Input the second integer: ");
        int number2 = input.nextInt();

        if (number2 == 0) {
            System.out.println("Cannot check multiple: second integer is zero.");
        } else {
            if (number1 % number2 == 0) {
                System.out.println(number1 + " is a multiple of " + number2 + ".");
            } else {
                System.out.println(number1 + " is not a multiple of " + number2 + ".");
            }
        }
    }
}
