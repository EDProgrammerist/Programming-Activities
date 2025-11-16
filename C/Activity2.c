#include <stdio.h> 

/* 
   Variables to store the width and height of a rectangle in inches 
*/
int width;          
int height;         

int area;           /* Variable to store the area of the rectangle */
int perimeter;      /* Variable to store the perimeter of the rectangle */

int main() {
    /* Assigning values to height and width */
	height = 7;
	width = 5;

    /* Calculating the perimeter of the rectangle */
    perimeter = 2*(height + width);
	printf("Perimeter of the rectangle = %d inches\n", perimeter);
	
    /* Calculating the area of the rectangle */
	area = height * width;
	printf("Area of the rectangle = %d square inches\n", area);

    return(0);
}
