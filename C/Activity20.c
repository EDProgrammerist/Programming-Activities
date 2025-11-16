#include <stdio.h>

int main() {
long nc = 0;         // Variable to count characters
int new_l = 0;       // Variable to count newlines
int n_word = 0;      // Variable to count words
int chr;             // Variable to hold input characters
int flag = 0;        // Flag to track word boundaries
int last = 0;        // Flag to track the last character

printf("Input some text:\n");

while ((chr = getchar()) != EOF) {
    ++nc;  // Increment the count of characters

if (chr == ' ' || chr == '\t') {
flag = 0;  // Reset the flag when a space or tab is encountered
    } else if (chr == '\n') {
      ++new_l;  // Increment the count of newlines
flag = 0;  // Reset the flag on a newline
    } else {
if (flag == 0) {
        ++n_word;  // Increment the count of words when a new word begins
      }
flag = 1;  // Set the flag to indicate a word is in progress
    }

if (flag == 0 && last == 0) {
printf("\n");  // Print a newline when a word ends and the last character was not a space
last = 1;     // Set last to 1 to indicate the last character was a space
    } else {
putchar(chr); // Print the character
last = 0;     // Set last to 0 to indicate the last character was not a space
    }
  }
}
