import java.util.Scanner;

public class Activity28 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = in.nextInt();

        int i = 1; 

        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }
    }
}
