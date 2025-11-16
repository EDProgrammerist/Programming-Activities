import java.util.Scanner;

public class Activity50 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        // Input
        int destination, time;
        double duration;

        System.out.print("Enter destination code (1-American, 2-Asian, 3-African, 4-European): ");
        destination = userInput.nextInt();

        System.out.print("Enter time code (1-Daytime, 2-Nighttime): ");
        time = userInput.nextInt();

        System.out.print("Enter duration of call in minutes: ");
        duration = userInput.nextDouble();

        // Variables for rate and unit minutes
        double rate = 0;
        double unitMinutes = 0;
        double totalCharge = 0;

        // Determine rate and unit minutes
        if (destination == 1) { // American
            if (time == 1) { // Day
                rate = 50;
                unitMinutes = 3;
            } else { // Night
                rate = 45;
                unitMinutes = 3;
            }
        } else if (destination == 2) { // Asian
            if (time == 1) { // Day
                rate = 30;
                unitMinutes = 2;
            } else { // Night
                rate = 27;
                unitMinutes = 2;
            }
        } else if (destination == 3) { // African
            if (time == 1) { // Day
                rate = 40;
                unitMinutes = 3;
            } else { // Night
                rate = 36;
                unitMinutes = 3;
            }
        } else if (destination == 4) { // European
            if (time == 1) { // Day
                rate = 35;
                unitMinutes = 2;
            } else { // Night
                rate = 30;
                unitMinutes = 2;
            }
        } else {
            System.out.println("Invalid destination code.");
            return;
        }

        double units = Math.ceil(duration / unitMinutes); 
        totalCharge = units * rate;

        System.out.println("Total charges for the call: P" + totalCharge);
    }
}
