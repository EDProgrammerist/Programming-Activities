import java.util.Scanner;

public class Activity52 {

    public static boolean isValidCode(String input) {
  
        if (input.length() > 5) {
            return false;
        }

        if (!input.startsWith("*")) {
            return false;
        }

        char lastChar = input.charAt(input.length() - 1);
        if (!Character.isLetter(lastChar)) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter code: ");
        String code = scanner.nextLine();

        scanner.close();

        if (isValidCode(code)) {
            System.out.println("Valid code");
        } else {
            System.out.println("Invalid code");
        }
    }
}
