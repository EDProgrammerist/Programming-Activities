import java.util.Scanner;

public class Activity54 {

    public static int power(int base, int exponent) {
        int result = 1;
        for(int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result; 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = in.nextInt();

        System.out.print("Enter exponent: ");
        int exponent = in.nextInt();

        int output = power(base, exponent);

        System.out.println("Output: " + output);
    }
}
