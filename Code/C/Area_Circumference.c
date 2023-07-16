#include<stdio.h>
int main()
{
    int red;
    printf("Enter the radius :");
    scanf("%d",&red);
    printf("Area is :%.2f",3.14*red*red);
    printf("\nCircumference is :%.2f",2*3.14*red);
    
    return 0;
}