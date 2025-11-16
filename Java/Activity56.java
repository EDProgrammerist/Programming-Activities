import java.util.Scanner;

public class Activity56 {


    static void calculateBombs(String number) {
        int totalBombs = 0;

        for (int i = 0; i < number.length(); i++) {
            char digit = number.charAt(i);

            int bombsForDigit;
            switch (digit) {
                case '0':
                case '5':
                case '6':
                case '7':
                    bombsForDigit = 1;
                    break;
                case '1':
                case '2':
                    bombsForDigit = 2;
                    break;
                default:
                    bombsForDigit = 0;
                    break;
            }

            totalBombs += bombsForDigit;

            System.out.println("digit =======> " + digit + " ==> " + bombsForDigit);
        }

        System.out.println("Total BOMBS: " + totalBombs);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input number: ");
        String number = sc.nextLine();

        calculateBombs(number);
    }
}
