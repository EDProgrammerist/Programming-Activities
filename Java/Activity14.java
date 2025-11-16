import java.util.Scanner;

public class Activity14 {

    public static void calculateAverageMarks() {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[99];
        int total = 0;
        int count = 0;

        for (int i = 0; ; i++) {
            System.out.print("Input Mathematics marks (0 to terminate): ");
            marks[i] = sc.nextInt();
            if (marks[i] <= 0) {
                break;
            }
            total += marks[i];
            count++;
        }

        if (count > 0) {
            float average = (float) total / count;
            System.out.printf("Average marks in Mathematics: %.2f\n", average);
        } else {
            System.out.println("No valid marks entered.");
        }
        
        sc.close();
    }

    public static void main(String[] args) {
        calculateAverageMarks(); 
    }
}
