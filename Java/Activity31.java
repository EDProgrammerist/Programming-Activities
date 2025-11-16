import java.util.Scanner;

public class Activity31 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of elements to be stored in the array: ");
        int elements = input.nextInt();

        int[] array = new int[elements];


        System.out.println("Input " + elements + " elements in the array:");
        for (int i = 0; i < elements; i++) {
            System.out.print("element - " + i + " : ");
            array[i] = input.nextInt();
        }

        int max = array[0];
        int min = array[0];

        for (int i = 1; i < elements; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Maximum element is : " + max);
        System.out.println("Minimum element is : " + min);
    }
}
