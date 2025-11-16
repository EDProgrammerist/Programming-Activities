#include <stdio.h>
#include <string.h>
#include <stdlib.h>

char* single_digits[] = { "zero", "one", "two", "three", "four", 
                           "five", "six", "seven", "eight", "nine" };

char* two_digits[] = { "", "ten", "eleven", "twelve", "thirteen", 
                       "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

char* tens_multiple[] = { "", "", "twenty", "thirty", "forty", "fifty", 
                           "sixty", "seventy", "eighty", "ninety" };

char* place_values[] = { "", "thousand", "million", "billion" }; // up to billions

// Converts numbers from 0-999 into words
void convert_chunk_to_words(int num) {
    if (num >= 100) {
        printf("%s hundred", single_digits[num / 100]);
        num %= 100;
        if (num > 0) printf(" ");
    }

    if (num >= 20) {
        printf("%s", tens_multiple[num / 10]);
        if (num % 10 != 0) {
            printf(" %s", single_digits[num % 10]);
        }
    }
    else if (num >= 10) {
        printf("%s", two_digits[num - 9]); // 10 -> index 1
    }
    else if (num > 0) {
        printf("%s", single_digits[num]);
    }
}

// Main function to handle large numbers
void convert_to_words(char* num_str) {
    int len = strlen(num_str);
    if (len == 0) {
        printf("Empty string\n");
        return;
    }
    if (len > 10) {
        printf("Number too large! Supports up to 10 digits.\n");
        return;
    }

    unsigned long number = strtoul(num_str, NULL, 10);
    if (number == 0) {
        printf("zero\n");
        return;
    }

    int parts[4] = {0}; // billion, million, thousand, hundreds
    int part_index = 0;

    while (number > 0) {
        parts[part_index++] = number % 1000;
        number /= 1000;
    }

    for (int i = part_index - 1; i >= 0; i--) {
        if (parts[i] != 0) {
            convert_chunk_to_words(parts[i]);
            if (i > 0) printf(" %s", place_values[i]);
            if (i > 0 || (i == 0 && parts[i] % 100 != 0)) printf(" ");
        }
    }
    printf("\n");
}

int main() {
    convert_to_words("1500");
    convert_to_words("2234156");
    convert_to_words("9876543210");
    return 0;
}
