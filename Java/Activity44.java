import java.util.Scanner;

public class Activity44 {

    // Method to calculate tax based on the given table
    public static double computeTax(double salary) {
        if (salary <= 50000) {
            return salary * 0.10;
        } else if (salary <= 100000) {
            return 5000 + (salary - 50000) * 0.15;
        } else if (salary <= 200000) {
            return 15000 + (salary - 100000) * 0.20;
        } else {
            return salary * 0.25;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter gross salary: ");
        double salary = sc.nextDouble();

        System.out.println("Tax to be paid: " + computeTax(salary));

        sc.close();
    }
}
