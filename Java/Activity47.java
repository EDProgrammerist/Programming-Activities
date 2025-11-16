import java.util.Scanner;

class Fibonacci {

    static int fib(int n) {
        int f[] = new int[n + 2]; 
        f[0] = 1; 
        f[1] = 1; 
        
        for (int i = 2; i < n; i++) {
            f[i] = f[i - 1] + f[i - 2]; 
        }
        
        return f[n - 1]; 
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive integer N: ");
        int N = sc.nextInt();
        
        System.out.println("First " + N + " Fibonacci numbers:");
        for (int i = 1; i <= N; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
