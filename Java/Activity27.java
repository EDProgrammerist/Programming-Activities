public class Activity27 {

    public static long factorial(int num) {
        long result = 1;

        int i = 1;
        while (i <= num) {
            result *= i;
            i++;
        }

        return result; 
    }

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        long fact = factorial(number);

        System.out.println("Factorial of " + number + " = " + fact);
    }
}
