import java.util.Scanner;

public class Activity9 {
    public static void main(String[] args) {
        int countP = 0, countN = 0;
        int[] arr = new int[5];
        Scanner scan = new Scanner(System.in);

        // Input 5 numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Input the " + (i + 1) + " number: ");
            arr[i] = scan.nextInt();
        }

        // positive and negative numbers
        for (int i = 0; i < 5; i++) {
            if (arr[i] > 0)
                countP++;
            else if (arr[i] < 0)
                countN++;
        }

        System.out.println("Number of positive numbers: " + countP);
        System.out.println("Number of negative numbers: " + countN);
    }
}
