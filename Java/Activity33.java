import java.util.Scanner;

public class Activity33 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input the size of array: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Input " + n + " elements in the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("element - " + i + " : ");
            arr[i] = input.nextInt();
        }

        // Sorting array in ascending order using simple bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        System.out.println("Elements of array in sorted ascending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
