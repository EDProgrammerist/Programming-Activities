#include <stdio.h>
#define PI 3.14159   /* Constant for pi */

/* Function prototype */
float getArea(float radius);

/* Global variable to store result */
float area;

int main() {
    float radius;

    printf("WELCOME TO NICO'S COMPUTING AREA OF THE CIRCLE PROGRAM\n\n");

    /* Ask user input */
    printf("Input radius: ");
    scanf("%f", &radius);

    /* Call function */
    area = getArea(radius);

    /* Display result with 2 decimal places */
    printf("Output: the area is : %.2f\n", area);

    return 0;
}

/* Function definition */
float getArea(float radius) {
    return PI * radius * radius;   /* Formula: πr^2 */
}
