#include <stdio.h>
int main()
{
    int i, j, rows, space;
    printf("Enter no of star line");
    scanf("%d", &rows);
    if(rows<0)
    {
    for (i = 1; i <= rows; i++)
    {
        for (space = 1; space <= (rows - i); space++)
        {
            printf(" ");
        }
        for (j = 1; j<=2* i-1; j++)
        {
            printf("*");
        }
        printf("\n");
    }
    for (i = rows-1; i >=1; i--)              //There is (rows -1) becouse we want 4 line print in display//
    {
        for (space = 1; space <= (rows-i); space++)
        {
            printf(" ");
        }
        for (j = 1; j<=2*i-1; j++)
        {
            printf("*");
        }
        printf("\n");
    }
    }

    return 0;
}