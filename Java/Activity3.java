import java.util.Scanner;

public class Activity3 {

    static Scanner sc = new Scanner(System.in); 

    public static void main(String[] args) {
        String id = getEmployeeId();
        int hours = getWorkingHours();
        double rate = getSalaryRate();

        double salary = calculateSalary(hours, rate);

        displayResult(id, salary);
    }

    public static String getEmployeeId() {
        System.out.print("Enter the employee id: ");
        return sc.next();
    }

    public static int getWorkingHours() {
        System.out.print("Enter the working hours: ");
        return sc.nextInt();
    }

    public static double getSalaryRate() {
        System.out.print("Enter the salary amount/hr: ");
        return sc.nextDouble();
    }

    public static double calculateSalary(int hours, double rate) {
        return hours * rate;
    }

    public static void displayResult(String id, double salary) {
        System.out.printf("Employee ID = %s\n", id);
        System.out.printf("Salary = U$ %.2f\n", salary);
    }
}
