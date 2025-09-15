#include <stdio.h>
int main() {
    int a, i, j = 1, x = 0;

    // Prompt for user input
    printf("Input number of lines: ");
    scanf("%d", &a);

    // Loop for each line
    for(i = 1; i <= a; i++) {
        // Loop to print numbers
        while(x < 3) {
            printf("%d ", j++);
            x++;
        }
        x = 0; // Reset the counter
        printf("\n");
    }

    return 0;
}
