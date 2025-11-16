public class Activity2 { 
    public static void main(String[] strings) {

        final double width = 7;
        final double height = 5;

        double perimeter = 2 * (height + width);
        double area = width * height;

        System.out.printf("Perimeter is 2*(%.0f + %.0f) = %.0f\n", height, width, perimeter);
        System.out.printf("Area is %.0f * %.0f = %.0f\n", width, height, area);
    }
}
