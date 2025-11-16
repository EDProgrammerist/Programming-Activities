#include<stdio.h>
int main() {
    int num, x, r_num = 0;

    // Prompt user to input a number
    printf("Input a number: ");
    scanf("%d", &num);

    // Display the original number
    printf("\nThe original number = %d", num);

    // Reverse the digits of the number
    while (num >= 1) {
        x = num % 10;
        r_num = r_num * 10 + x;
        num = num / 10;
    }

    // Display the reverse of the number
    printf("\nThe reverse of the said number = %d", r_num);

    return 0;
}
