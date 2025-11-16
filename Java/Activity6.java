import java.util.Scanner;

public class Activity6 {

    public static int calculateNotes(int amt, int denomination) {
        int notes = amt / denomination;
        System.out.println(notes + " Note(s) of " + denomination + ".00");
        return amt - (notes * denomination); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amt = sc.nextInt();

        int[] denominations = {100, 50, 20, 10, 5, 2, 1};

        for (int denom : denominations) {
            amt = calculateNotes(amt, denom);
        }
        
        sc.close();
    }
}
