import java.util.Scanner;

public class Activity36 {

    public static String checkOddEven(int number) {
        if (number == 0) {
            return "Zero";
        } else if ((number & 1) == 0) { 
            return "even";
        } else {
            return "odd";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input any number: ");
        int num = sc.nextInt();

        System.out.println("The entered number is " + checkOddEven(num) + ".");
    }
}
