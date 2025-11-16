#include <stdio.h>

int main() {
    int sec, hr, min;

    printf("Input seconds: ");
    scanf("%d", &sec);

    hr = sec / 3600;
    min = (sec % 3600) / 60;
    sec = sec % 60;

    printf("There are:\n");
    printf("H:M:S - %d:%d:%d\n", hr, min, sec);

    return 0;
}
