import java.util.Scanner;
import java.util.Arrays;

public class Activity53 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] scores = new double[10];

        System.out.println("Please enter 10 scores:");

        for (int i = 0; i < 10; i++) {
            scores[i] = in.nextDouble();
        }

        Arrays.sort(scores);

        double sum = 0;
        for (int i = 1; i < 9; i++) {
            sum += scores[i];
        }

        double finalScore = sum / 8;

        System.out.printf("The final score is: %.2f\n", finalScore);
    }
}
