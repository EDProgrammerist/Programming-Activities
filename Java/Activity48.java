import java.util.Scanner;

public class Activity48 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double principal = -1;
        int years = -1;
        double rate = 0.10; 

        while (principal <= 0) {
            System.out.print("Enter the principal amount (positive number): ");
            principal = input.nextDouble();
            if (principal <= 0) {
                System.out.println("Amount must be positive. Try again.");
            }
        }

        while (years <= 0) {
            System.out.print("Enter the number of years (positive integer): ");
            years = input.nextInt();
            if (years <= 0) {
                System.out.println("Number of years must be positive. Try again.");
            }
        }

        double finalAmount = principal;
        for (int i = 1; i <= years; i++) {
            finalAmount = finalAmount + finalAmount * rate; 
        }

        System.out.printf("After %d years at 10%% interest, your investment will be worth %.2f%n", years, finalAmount);

        input.close();
    }
}
