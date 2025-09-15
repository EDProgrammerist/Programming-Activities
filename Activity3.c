#include <stdio.h>
int main() {
    char id[11];         // Variable to store employee ID (up to 10 characters)
    int hour;            // Variable to store working hours
    double value, salary; // Variables for hourly salary and total salary

    // Prompt user for employee ID
    printf("Input the Employees ID(Max. 10 chars): ");
    scanf("%s", &id);

    // Prompt user for working hours
    printf("\nInput the working hrs: ");
    scanf("%d", &hour);

    // Prompt user for hourly salary
    printf("\nSalary amount/hr: ");
    scanf("%lf", &value);

    // Calculate total salary
    salary = value * hour;

    // Print employee ID and salary
    printf("\nEmployees ID = %s\nSalary = U$ %.2lf\n", id, salary);

    return 0;
}
