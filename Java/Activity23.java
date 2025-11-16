import java.util.Scanner;

public class Activity23 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        
        // take only the first character
        char ch = scanner.next().charAt(0);  

        // convert character to lowercase 
        ch = Character.toLowerCase(ch);

        // check using switch case
        switch(ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.print(ch + " is a vowel");
                break;
            default:
                // check if it's a valid alphabet
                if (Character.isLetter(ch))
                    System.out.print(ch + " is a consonant");
                else
                    System.out.print("Invalid input. Please enter an alphabet.");
        }

        scanner.close();
    }
}