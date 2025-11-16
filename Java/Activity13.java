import java.util.Scanner;

public class Activity13 {

    public static void printLines(int lines) {
        int num = 1; 
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= 3; j++) { 
                System.out.print(num + " ");
                num++;
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of lines: ");
        int n = sc.nextInt();

        printLines(n);

        sc.close();
    }
}
