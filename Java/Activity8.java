import java.util.Scanner;

public class Activity8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        while (true) {
            System.out.print("Enter month's number or -1 to exit: ");
            int month = in.nextInt();
            if (month == -1) {
                break;
            }
            if (month >= 1 && month <= 12) {
                System.out.println(months[month - 1]);
            } else {
                System.out.println("Invalid month");
            }
        }
    }
}
