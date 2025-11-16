import java.util.Scanner;

public class Activity46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            // Prompt the user
            System.out.print("Input a string: ");
            input = scanner.nextLine();

            // Check if the input is "tiuq" to exit
            if (input.equals("tiuq")) {
                System.out.println("Exiting program...");
                break;
            }

            // Reverse the string
            char[] letters = input.toCharArray();
            System.out.print("Reversed string: ");
            for (int i = letters.length - 1; i >= 0; i--) {
                System.out.print(letters[i]);
            }
            System.out.println(); 
        }

        scanner.close();
    }
}
