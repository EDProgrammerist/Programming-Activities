import java.util.Scanner;

public class Activity21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the currency value (floating point with two decimal places):");
        double input = sc.nextDouble();

        int cents = (int) Math.round(input * 100);

        cents = printNotes(cents);

        printCoins(cents);

        sc.close();
    }

    public static int printNotes(int cents) {
        int[] notes = {10000, 5000, 500, 200};  
        int[] noteValues = {100, 50, 5, 2};     

        System.out.println("\nCurrency Notes:");
        for (int i = 0; i < notes.length; i++) {
            int count = cents / notes[i];
            if (count > 0) {
                System.out.println(noteValues[i] + " number of Note(s): " + count);
                cents %= notes[i];
            }
        }
        return cents; 
    }

    public static void printCoins(int cents) {
        int[] coins = {50, 25};     
        String[] coinValues = {".50", ".25"};

        System.out.println("\nCurrency Coins:");
        for (int i = 0; i < coins.length; i++) {
            int count = cents / coins[i];
            if (count > 0) {
                System.out.println(coinValues[i] + " number of Coin(s): " + count);
                cents %= coins[i];
            }
        }
    }
}
