#include <stdio.h>

/* Function prototype */
float getArea(float side);

/* Global variable to store result */
float area;

int main() {
    float side;

    printf("WELCOME TO NICO'S COMPUTING AREA OF THE SQUARE PROGRAM\n\n");

    /* Ask user input */
    printf("Input side: ");
    scanf("%f", &side);

    /* Call function */
    area = getArea(side);

    /* Display result without decimals */
    printf("Output: the area is : %.0f\n", area);

    return 0;
}

/* Function definition */
float getArea(float side) {
    return side * side;   /* Formula: S^2 */
}
