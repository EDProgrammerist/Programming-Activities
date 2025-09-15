#include <stdio.h>

int main() {
    float salary, tax_amount = 0;

    printf("Enter the Gross Salary: ");
    scanf("%f", &salary);

    while (salary > 0) {
        if (salary > 200000) {
            tax_amount += (salary - 200000) * 0.25;
            salary = 200000; // Reduce salary to next slab
        }
        else if (salary > 100000) {
            tax_amount += (salary - 100000) * 0.20;
            salary = 100000;
        }
        else if (salary > 50000) {
            tax_amount += (salary - 50000) * 0.15;
            salary = 50000;
        }
        else { // salary <= 50000
            tax_amount += salary * 0.10;
            break; // Done
        }
    }

    printf("Net Tax Amount: %.2f\n", tax_amount);

    return 0;
}
