import java.util.Scanner;

public class Activity11 {

    public static String findQuadrant(int x, int y) {
        if (x > 0 && y > 0)
            return "Quadrant-I (+,+)";
        else if (x < 0 && y > 0)
            return "Quadrant-II (-,+)";
        else if (x < 0 && y < 0)
            return "Quadrant-III (-,-)";
        else if (x > 0 && y < 0)
            return "Quadrant-IV (+,-)";
        else if (x == 0 && y == 0)
            return "Origin";
        else if (y == 0 && x != 0)
            return "x-axis";
        else 
            return "y-axis";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // user input
        System.out.println("Input the coordinates (x, y):");
        System.out.print("x: ");
        int x = sc.nextInt();
        System.out.print("y: ");
        int y = sc.nextInt();

        // find quadrant
        String result = findQuadrant(x, y);
        System.out.println(result);

        sc.close();
    }
}
