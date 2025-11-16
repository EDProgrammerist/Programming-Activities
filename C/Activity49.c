
#include <stdio.h>  // Include standard input/output header file.

void main() {
    int i, n, sum = 0;  
    int largest, smallest;  
    int sum_positive = 0, sum_negative = 0;  
    int count_negative = 0, count_between_50_100 = 0;  

    printf("Input the 10 numbers : \n");  

    for (i = 1; i <= 10; i++) {  
        printf("Number-%d :", i);  
        scanf("%d", &n);  

        sum += n;  // add to total sum

        if (i == 1) {  
            largest = smallest = n;  // initialize largest and smallest with first input
        } else {  
            if (n > largest)  
                largest = n;  
            if (n < smallest)  
                smallest = n;  
        }

        if (n > 0)  
            sum_positive += n;  
        else if (n < 0) {  
            sum_negative += n;  
            count_negative++;  
        }

        if (n >= 50 && n <= 100)  
            count_between_50_100++;  
    }

    printf("\nResults:\n");  
    printf("a. Their total : %d\n", sum);  
    printf("b. The largest : %d\n", largest);  
    printf("c. The smallest : %d\n", smallest);  
    printf("d. The total of all positive numbers : %d\n", sum_positive);  
    printf("e. The total of all negative numbers : %d\n", sum_negative);  
    printf("f. How many negative numbers were entered : %d\n", count_negative);  
    printf("g. How many numbers between 50 and 100 were entered : %d\n", count_between_50_100);  
}
