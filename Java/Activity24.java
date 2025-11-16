import java.util.Scanner;

public class Activity24 {

    public static String digitToWord(char digit) {

        String[] digitWords = {"Zero", "One", "Two", "Three", "Four",
                               "Five", "Six", "Seven", "Eight", "Nine"};

        if (!Character.isDigit(digit)) {
            return "Invalid input. Not a digit.";
        }

        return digitWords[digit - '0'];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single digit: ");
        String input = scanner.nextLine();

        if (input.length() != 1) {
            System.out.println("Invalid input. Please enter a single digit (0-9).");
            return;
        }

        char digit = input.charAt(0);

        String word = digitToWord(digit);
        System.out.println(word);
    }
}
