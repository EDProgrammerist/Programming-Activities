import java.util.Scanner;

public class Activity30 {
    public static void main(String args[]) {
        String s, w = "", lw = "";
        int i;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence");
        s = sc.nextLine();

        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                w = w + s.charAt(i);   // build the word
            } else {
                if (w.length() > lw.length()) {
                    lw = w;            // update longest word
                }
                w = "";                // reset for next word
            }
        }

        // After loop ends, check the last word
        if (w.length() > lw.length()) {
            lw = w;
        }

        System.out.println("Longest word = " + lw);
        System.out.println("Length = " + lw.length());
    }
}
