#include <stdio.h>
#include <math.h> // For ceil()

int main() {
    float distance;
    float fare;

    // Input distance from user
    printf("Enter distance traveled in meters: ");
    scanf("%f", &distance);

    // Calculate fare
    if (distance <= 300) {
        fare = 20.0; // First 300 meters
    } else {
        // Distance beyond first 300 meters
        float extra_distance = distance - 300;
        // Calculate how many 200-meter zones, round up
        int zones = ceil(extra_distance / 200.0);
        fare = 20.0 + zones * 2.0;
    }

    // Output the result
    printf("The taxi fare is: P %.2f\n", fare);

    return 0;
}
