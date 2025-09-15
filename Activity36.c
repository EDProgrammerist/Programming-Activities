#include <stdio.h>   // Include the standard input/output header file.

void main()
{
    int num1, rem1;   // Declare two integer variables 'num1' and 'rem1'.

    printf("Input an integer : ");   // Prompt the user to input an integer.
    scanf("%d", &num1);   // Read and store the user's input in 'num1'.
    rem1 = num1 % 2;   // Calculate the remainder of 'num1' when divided by 2.
    if (rem1 == 0)   // Check if the remainder is equal to 0.
        printf("%d is an even integer\n", num1);   // Print a message indicating that 'num1' is an even integer.
    else
        printf("%d is an odd integer\n", num1);    // Print a message indicating that 'num1' is an odd integer.
}
