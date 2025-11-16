import java.util.*;

class GfG {
    static String convertToWords(long n) {
        if (n == 0) 
            return "Zero";
        
        // Words for numbers 0 to 19
        String[] units = {
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
            "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
            "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
        };
        
        // Words for multiples of 10
        String[] tens = { 
            "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" 
        };
        
        String[] multiplier = {"", "Thousand", "Million", "Billion"};

        String res = "";
        int group = 0;
        
        while (n > 0) {
            if (n % 1000 != 0) {
                int value = (int)(n % 1000);
                String temp = "";
                
                // Handle hundreds
                if (value >= 100) {
                    temp = units[value / 100] + " Hundred ";
                    value %= 100;
                }

                // Handle tens
                if (value >= 20) {
                    temp += tens[value / 10] + " ";
                    value %= 10;
                }

                // Handle units
                if (value > 0) {
                    temp += units[value] + " ";
                }

                // Add multiplier
                temp += multiplier[group] + " ";

                // Prepend to result
                res = temp + res;
            }
            n /= 1000;
            group++;
        }
        
        return res.trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (up to 10 digits): ");
        long n = sc.nextLong();
        System.out.println(convertToWords(n));
    }
}
