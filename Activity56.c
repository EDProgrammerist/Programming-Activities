#include <stdio.h>

int main() {
    int number;
    printf("Input number: ");
    scanf("%d", &number);

    int bombs = 0;

    while (number > 0) {
        int digit = number % 10;

        if (digit == 0 || digit == 5 || digit == 6 || digit == 7) {
            bombs += 1;
        } else if (digit == 1 || digit == 2) {
            bombs += 2;
        }

        number /= 10;
    }

    printf("%d bombs\n", bombs);

    return 0;
}
