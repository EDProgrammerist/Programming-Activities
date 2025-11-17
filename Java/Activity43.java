import java.util.Scanner;

public class Activity43 {

    public static int[] getDigits(int num) {
        int d1 = num / 1000;
        int d2 = (num / 100) % 10;
        int d3 = (num / 10) % 10;
        int d4 = num % 10;

        return new int[] { d1, d2, d3, d4 };
    }

    public static void printSpaced(int[] digits) {
        System.out.println(digits[0] + " " + digits[1] + " " + digits[2] + " " + digits[3]);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("INPUT FOUR DIGIT INTEGER: ");

        int num = input.nextInt();

        int[] digits = getDigits(num);   
        printSpaced(digits);             
    }
}
