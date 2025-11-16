import java.util.Scanner;

public class Activity35 {
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

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        System.out.println("The Second largest element in the array is : " + secondLargest);
    }
}
