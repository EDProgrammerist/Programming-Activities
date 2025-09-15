#include <stdio.h>
int main() {
    int e, i, sval, position;

    // Prompt user to input the length of the array
    printf("\nInput the length of the array: ");
    scanf("%d", &e);

    // Declare an array of length 'e'
    int v[e];

    // Prompt user to input the array elements
    printf("\nInput the array elements:\n ");
    for(i = 0; i < e; i++) {
        scanf("%d", &v[i]);
    }

    // Initialize 'sval' and 'position' with the first element of the array
    sval = v[0];
    position = 0;

    // Find the smallest value and its position in the array
    for(i = 0; i < e; i++) {
        if(sval > v[i]) {
            sval = v[i];
            position = i;
        }
    }

    // Print the smallest value and its position
    printf("Smallest Value: %d\n", sval);
    printf("Position of the element: %d\n", position);

    return 0;
}
