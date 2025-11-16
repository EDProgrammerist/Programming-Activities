import java.util.Scanner;

public class Activity38 {

    public static void checkLeapYear(int year) {

        if (year < 1000 || year > 9999) {
            System.out.println("invalid year");
        } else {
            boolean leap = false;

            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0)
                        leap = true;
                    else
                        leap = false;
                } else {
                    leap = true;
                }
            } else {
                leap = false;
            }

            if (leap)
                System.out.println("Leap Year");
            else
                System.out.println("Not a Leap Year");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input year: ");
        int year = sc.nextInt();

        checkLeapYear(year);

        sc.close();
    }
}
