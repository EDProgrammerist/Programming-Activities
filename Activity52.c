#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <stdbool.h>

bool is_valid_code(char code[]);

int main()
{
    char code[100];  // buffer for user input

    printf("Enter a code: ");
    scanf("%s", code);  // read user input

    printf("input: %s\n", code);
    if (is_valid_code(code)) 
        printf("\tvalid code\n");
    else 
        printf("\tinvalid code\n");

    return 0;
}

// returns true if the code is valid according to the rules
bool is_valid_code(char code[])
{
    int len = strlen(code);

    if (len > 5) return false;  // maximum length 5

    // check that each character is a letter, digit, or '*'
    for (int i = 0; i < len; i++)
    {
        if (!isalnum(code[i]) && code[i] != '*') 
            return false;
    }

    return true;
}
