#include <stdio.h>

int main() {
    int number, result;

    printf("Please, enter four numbers: ");
    scanf("%d", &number);

    // Handle the thousands digit
    result = number / 1000;        // get 1st digit
    printf("%d ", result);
    number %= 1000;                // remove 1st digit

    // Handle the hundreds digit
    result = number / 100;         // get 2nd digit
    printf("%d ", result);
    number %= 100;                 // remove 2nd digit

    // Handle the tens digit
    result = number / 10;          // get 3rd digit
    printf("%d ", result);
    number %= 10;                  // remove 3rd digit

    // Handle the ones digit
    printf("%d\n", number);        // last digit

    return 0;
}
