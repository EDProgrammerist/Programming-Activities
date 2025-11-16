public class Activity18 {

    public static void abs_val(int y) {
        int result;

        if (y < 0)
            result = y * -1;
        else
            result = y;

        System.out.println("Absolute value = " + result);
    }

    public static void main(String[] args) throws Exception {

        System.out.println("Input a value (negative): ");

        int x = 0;
        int sign = 1;
        int ch;

        while ((ch = System.in.read()) != '\n') {
            if (ch == '-') {
                sign = -1;
            } else if (ch >= '0' && ch <= '9') {
                x = x * 10 + (ch - '0');
            }
        }
        x = x * sign;

        System.out.println("Original value = " + x);

        abs_val(x);
    }
}
