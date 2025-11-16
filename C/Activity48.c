#include <stdio.h>

int main() {
    double amount, futureValue;
    int years, i;               
    
    printf("Input initial amount: ");
    scanf("%lf", &amount);

    printf("Input number of years: ");
    scanf("%d", &years);
    
    if (amount <= 0 || years <= 0) {
        printf("Both amount and number of years must be positive.\n");
        return 0;
    }

    futureValue = amount;
    for (i = 0; i < years; i++) {
        futureValue = futureValue + (futureValue * 10 / 100); // add 10% each year

    }
    printf("After %d year(s)\nThe amount will be worth: %.2lf", years, futureValue);
    
    return 0;
}
