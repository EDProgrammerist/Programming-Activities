#include <stdio.h>

int main() {
    int destination, time, duration;
    float cost = 0.0;

    printf("LONG DISTANCE CALL COST CALCULATOR\n\n");
    printf("Destination Codes:\n");
    printf("1. American Region\n");
    printf("2. Asian Region\n");
    printf("3. African Region\n");
    printf("4. European Region\n\n");

    printf("Time Codes:\n");
    printf("1. Daytime\n");
    printf("2. Nighttime\n\n");

    // Get user input
    printf("Enter destination code (1-4): ");
    scanf("%d", &destination);

    printf("Enter time code (1 for Day, 2 for Night): ");
    scanf("%d", &time);

    printf("Enter call duration in minutes: ");
    scanf("%d", &duration);

    // Calculate cost based on destination and time
    if (destination == 1) {
        if (time == 1)
            cost = ((duration + 2) / 3) * 50;  // Round up to nearest 3 minutes
        else if (time == 2)
            cost = ((duration + 2) / 3) * 45;
        else
            printf("Invalid time code.\n");
    } else if (destination == 2) {
        if (time == 1)
            cost = ((duration + 1) / 2) * 30;  // Round up to nearest 2 minutes
        else if (time == 2)
            cost = ((duration + 1) / 2) * 27;
        else
            printf("Invalid time code.\n");
    } else if (destination == 3) {
        if (time == 1)
            cost = ((duration + 2) / 3) * 40;
        else if (time == 2)
            cost = ((duration + 2) / 3) * 36;
        else
            printf("Invalid time code.\n");
    } else if (destination == 4) {
        if (time == 1)
            cost = ((duration + 1) / 2) * 35;
        else if (time == 2)
            cost = ((duration + 1) / 2) * 30;
        else
            printf("Invalid time code.\n");
    } else {
        printf("Invalid destination code.\n");
    }

    // Output the total charge
    if (cost > 0.0) {
        printf("\nTotal call cost: P %.2f\n", cost);
    }

    return 0;
}
