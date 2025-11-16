#include <stdio.h>

/* Function prototype */
int getArea(int length, int width);

/* Global variable to store result */
int area;

int main() {
    int length, width;

    printf("WELCOME TO NICO'S COMPUTING AREA OF THE RECTANGLE PROGRAM\n\n");

    /* Ask user input */
    printf("Input length: ");
    scanf("%d", &length);

    printf("Input width: ");
    scanf("%d", &width);

    /* Call function */
    area = getArea(length, width);

    /* Display result */
    printf("Output: the area is : %d\n", area);

    return 0;
}

/* Function definition */
int getArea(int length, int width) {
    return length * width;
}
