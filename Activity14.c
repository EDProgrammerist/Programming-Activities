#include <stdio.h>
int main() {
    int marks[99], m, i, a=0, total=0;
    float f;
    
    // Prompt for user input
    printf("Input Mathematics marks (0 to terminate): ");
    
    // Loop to get input marks
    for(i = 0; ; i++) {
        scanf("%d", &marks[i]);
        if(marks[i] <= 0) {
            break;
        }
        a++;
        total += marks[i];
    }
    
    // Calculate and print average
    f = (float)total/(float)a;
    printf("Average marks in Mathematics: %.2f\n", f);
    
    return 0;
}
