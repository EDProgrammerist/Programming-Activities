#include <stdio.h>

void main()
{
    int arr1[100];
    int n, i, j, tmp;

    // Prompt user for input
    printf("\n\nSort elements of array in descending order:\n");
    printf("----------------------------------------------\n");
    printf("Input the size of array : ");
    scanf("%d", &n);

    // Input elements for the array
    printf("Input %d elements in the array :\n", n);
    for (i = 0; i < n; i++)
    {
        printf("element - %d : ", i);
        scanf("%d", &arr1[i]);
    }

    // Sorting elements in descending order using the Bubble Sort algorithm
    for (i = 0; i < n; i++)
    {
        for (j = i + 1; j < n; j++)
        {
            if (arr1[i] < arr1[j])
            {
                // Swap elements if they are in the wrong order
                tmp = arr1[i];
                arr1[i] = arr1[j];
                arr1[j] = tmp;
            }
        }
    }

    // Print sorted elements in descending order
    printf("\nElements of array are sorted in descending order:\n");
    for (i = 0; i < n; i++)
    {
        printf("%d  ", arr1[i]);
    }
    printf("\n\n");
}
