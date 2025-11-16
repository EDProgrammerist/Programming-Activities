import java.util.Scanner;

public class Activity49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int total = 0;
        int lar = 0;
        int small = 0;
        int posTotal = 0;
        int negTotal = 0;
        int negCount = 0;
        int count50to100 = 0;

        System.out.println("Enter 10 numbers:");

        for (int i = 1; i <= 10; i++) {
            n = sc.nextInt();

            total += n;

            if (i == 1) {
                lar = n;
                small = n;
            } else {
                if (n > lar) lar = n;
                if (n < small) small = n;
            }

            if (n > 0) posTotal += n;
            if (n < 0) {
                negTotal += n;
                negCount++;
            }

            if (n >= 50 && n <= 100) count50to100++;
        }

        System.out.println("Total of all numbers: " + total);
        System.out.println("Largest number: " + lar);
        System.out.println("Smallest number: " + small);
        System.out.println("Total of positive numbers: " + posTotal);
        System.out.println("Total of negative numbers: " + negTotal);
        System.out.println("Number of negative numbers: " + negCount);
        System.out.println("Numbers between 50 and 100: " + count50to100);

        sc.close();
    }
}
