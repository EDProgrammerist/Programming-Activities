#include<stdio.h>
#define N 10
// Function prototype declaration
int abs_val(int);

int main() {
    int x, result;

    // Prompt for user input
    printf("Input a value (negative): \n");
    scanf("%d", &x);
    printf("Original value = %d", x);

    // Call the abs_val function and store the result
    result = abs_val(x);

    // Output the result
    printf("\nAbsolute value = %d", result);

    return 0;
}

// Function to calculate the absolute value
int abs_val(int y) {
    if(y < 0)
        return(y * -1);
    else
        return(y);
}
