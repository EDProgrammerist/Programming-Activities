import java.util.Scanner;

public class Activity55 {


    public static void printPattern(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int input = in.nextInt();

        input = Math.abs(input);

        printPattern(input);
    }
}
