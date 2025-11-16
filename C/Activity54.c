#include <stdio.h>

int main() {
    int base, exponent;
    long long result = 1;

    // Ask for base
    printf("Enter the base number: ");
    scanf("%d", &base);

    // Ask for exponent
    printf("Enter the exponent: ");
    scanf("%d", &exponent);

    // Only handle non-negative exponents
    if (exponent < 0) {
        printf("Negative exponents not supported.\n");
        return 0;
    }

    // Multiply base exponent times
    while (exponent > 0) {
        result *= base;
        exponent--;
    }

    // Print result
    printf("Output: %lld\n", result);

    return 0;
}
