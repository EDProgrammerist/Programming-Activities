#include <stdio.h>
int main() {
    float numbers[5]; // Declare an array to store 5 numbers
    int j, pctr=0, nctr=0; // Declare variables for loop counter, positive count, and negative count

    // Prompt user for five numbers and store them in the array
    printf("\nInput the first number: "); 
    scanf("%f", &numbers[0]);
    printf("\nInput the second number: "); 
    scanf("%f", &numbers[1]);
    printf("\nInput the third number: "); 
    scanf("%f", &numbers[2]);
    printf("\nInput the fourth number: "); 
    scanf("%f", &numbers[3]);
    printf("\nInput the fifth number: "); 
    scanf("%f", &numbers[4]);

    for(j = 0; j < 5; j++) {
        if(numbers[j] > 0) // Check if the number is positive
        {
            pctr++; // Increment positive count
        }
        else if(numbers[j] < 0) // Check if the number is negative
        {
            nctr++; // Increment negative count
        }
    }

    // Print the counts of positive and negative numbers
    printf("\nNumber of positive numbers: %d", pctr);
    printf("\nNumber of negative numbers: %d", nctr);
    printf("\n");

    return 0;
}

