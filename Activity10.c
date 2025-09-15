#include <stdio.h>
int main() {
    int pass, x = 10; // Initialize variables for password and loop control

    while (x != 0) {
        printf("\nInput the password : ");
        scanf("%d", &pass); // Read the password input

        if (pass == 1234) {
            printf("Correct password"); // If the password is correct, print a success message
            x = 0; // Set x to 0 to exit the loop
        } else {
            printf("Wrong password, try another"); // If the password is incorrect, prompt for another attempt
        }

        printf("\n");
    }

    return 0;
}
