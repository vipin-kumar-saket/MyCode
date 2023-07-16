#include<stdio.h>
int main()
{
    int a,i,j;
    printf("Enter a number you want to print a number :");
    scanf("%d",&a);

    for ( i = 1; i <=a; i++)
    {
        for ( j = 1; j <=a; j++)
        {
           printf("*");
        }
        printf("\n");
    }
    
    return 0;
}