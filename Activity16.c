#include <stdio.h> 
// Define a constant for converting inches to centimeters
#define INCH_TO_CM 2.54

int main() {
    double inch, cm;

    // Prompt user to input the distance in centimeters
    printf("Input the distance in cm:\n");
    scanf("%lf", &cm);

    // Convert centimeters to inches
    inch = cm / INCH_TO_CM;

    // Display the converted distance
    printf("Distance of %0.2lf cms is = %0.2lf inches\n", cm, inch);

    return 0;
}
