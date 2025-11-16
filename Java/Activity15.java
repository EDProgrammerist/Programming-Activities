import java.util.Scanner;

public class Activity15 {

    public static int[] findthesmallestelementanditsposition(int[] arr) {
        int minValue = arr[0];
        int minPosition = 0; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minPosition = i; 
            }
        }
        return new int[]{minValue, minPosition};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the length of the array: ");
        int length = scanner.nextInt();

        int[] array = new int[length];

        System.out.println("Input the array elements:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        int[] result = findthesmallestelementanditsposition(array);

        System.out.println("Smallest Value: " + result[0]);
        System.out.println("Position of the element: " + result[1]);

        scanner.close(); 
    }
}
