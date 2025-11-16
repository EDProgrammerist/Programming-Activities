import java.util.Scanner;

public class Activity10 {

    public static boolean isCorrectPassword(String input) {
        return "1234".equals(input);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;

        do {
            System.out.print("Input the password: ");
            password = sc.nextLine();

            if (isCorrectPassword(password)) {
                System.out.println("Correct password");
            } else {
                System.out.println("Incorrect password");
            }
        } while (!isCorrectPassword(password));

        sc.close();
    }
}
