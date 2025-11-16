import java.util.Scanner;

public class Activity32 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of elements to be stored in the array: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Input " + n + " elements in the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("element - " + i + " : ");
            arr[i] = input.nextInt();
        }

 
        int evenCount = 0, oddCount = 0;
        for (int num : arr) {
            if (num % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        int[] even = new int[evenCount];
        int[] odd = new int[oddCount];

        int eIndex = 0, oIndex = 0;
        for (int num : arr) {
            if (num % 2 == 0)
                even[eIndex++] = num;
            else
                odd[oIndex++] = num;
        }

        System.out.println("The Even elements are :");
        for (int num : even) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("The Odd elements are :");
        for (int num : odd) {
            System.out.print(num + " ");
        }
    }
}
