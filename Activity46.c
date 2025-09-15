#include <stdio.h>
#include <stdlib.h> // for exit()

int main() {
    char original[100];
    int i, len;

    while (1) {
        printf("Enter a string (type 'tiuq' to exit): ");
        fgets(original, sizeof(original), stdin);

        // Remove newline manually and count length
        len = 0;
        while (original[len] != '\0') {
            if (original[len] == '\n') {
                original[len] = '\0';
                break;
            }
            len++;
        }

        // Exit if user types "tiuq"
        if (original[0] == 't' && original[1] == 'i' &&
            original[2] == 'u' && original[3] == 'q' &&
            original[4] == '\0') {
            exit(0);
        }

        printf("Reversed string = ");
        for (i = len - 1; i >= 0; i--) {
            printf("%c", original[i]);
        }
        printf("\n");
    }

    return 0;
}
