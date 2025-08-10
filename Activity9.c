#include<stdio.h>
int main()
{
    //Program that reads 5 numbers and counts the number of positive and negative numbers
    int n[5];
    int i,pos = 0,neg = 0;
    for(i = 0; i < 5; i++)
    {
    printf("Input the elements n[%d] : ", i);
    scanf("%d", &n[i]);
    {
        if(n[i] > 0)
        { 
            pos++;
            
        }
        else if(n[i] < 0)
        {
            neg++;
        }
    }
    }
    
    printf("Number of positive numbers: %d\n" ,pos);
    printf("Number of negative numbers: %d" ,neg);
    return 0;
}