import java.util.Scanner;

public class Activity4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); // Scanner opened

        System.out.print("Input the first integer: ");
        int n1 = in.nextInt();

        System.out.print("Input the second integer: ");
        int n2 = in.nextInt();

        System.out.print("Input the third integer: ");
        int n3 = in.nextInt();

        int max = n1;
        if (n2 > max)
            max = n2;
        if (n3 > max)
            max = n3;

        System.out.println("Maximum value of three integers: " + max);

        in.close(); 
    }
}
