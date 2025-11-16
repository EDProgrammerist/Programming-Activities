import java.util.Scanner;

public class Activity42 {

    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;
        int remainder;

        while (num > 0) {
            remainder = num % 10;
            reversed = (reversed * 10) + remainder;
            num = num / 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a five-digit integer: ");
        int n = in.nextInt();

        if (n < 10000 || n > 99999) {
            System.out.println("ONLY FIVE DIGIT");
        } else {
   
            boolean result = isPalindrome(n);
            if (result) {
                System.out.println("PALINDROME");
            } else {
                System.out.println("NOT PALINDROME");
            }
        }
    }
}
