#include <stdio.h>

int main(){
    
    char ch;
    int uppercase, lowercase;

    printf("Enter an alphabet : ");
    scanf("%c",&ch);

    uppercase = ( ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' );
    lowercase = ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' );

    if( uppercase || lowercase ) 
        printf("%c is a vowel",ch);
    else 
        printf("%c is a consonant",ch);

    return 0;
}