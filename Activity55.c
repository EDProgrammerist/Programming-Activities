#include <stdio.h>
#include <stdlib.h>  // for abs()

// Function to print the number pattern
void printPattern(int num) {
    for (int i = 1; i <= num; i++) {
        for (int j = 1; j <= i; j++) {
            printf("%d", i);
        }
        printf("\n");
    }
}

int main() {
    int num;

    printf("Input number (1-99): ");
    scanf("%d", &num);

    num = abs(num);  // Ignore negative values

    // Validate that it's a 1- or 2-digit number
    if (num < 1 || num > 99) {
        printf("INPUT ERROR: Please enter a 1- or 2-digit positive number (1-99).\n");
        return 1;
    }

    printPattern(num);  // Call the function

    return 0;
}
