import java.util.*;

public class Activity26 {

    public static void main(String[] args) {
        String username = getValidUsername(); 
        System.out.println("Your valid username is: " + username);
    }

    public static String getValidUsername() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a username (at least 8 characters):");
            String username = input.nextLine();

            if (username.length() >= 8) {
                return username;  
            } else {
                System.out.println("Invalid username. Try again.");
            }
        }
    }
}
