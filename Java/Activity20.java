import java.util.Scanner;

public class Activity20 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input some text:");

        String userInput = scanner.nextLine();
        scanner.close();

        String[] words = userInput.split(" ");

        for (String word : words) {
            System.out.println(word);
        }
    }
}
