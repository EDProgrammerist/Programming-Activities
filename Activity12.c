#include <stdio.h>
int main() {
    int x, y;
    float div_result;

    // Prompt for user input
    printf("Input two numbers: ");
    printf("\nx: ");
    scanf("%d", &x);
    printf("y: ");
    scanf("%d", &y);

    // Check if division is possible
    if(y != 0) {
        div_result = x/y;
        printf("%.1f\n", div_result);
    } else {
        printf("Division not possible.\n");
    }

    return 0;
}
