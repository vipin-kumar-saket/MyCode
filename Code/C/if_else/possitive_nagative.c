#include <stdio.h>
int main()
{
    int a;
    printf("Enter a number :");
    scanf("%d", &a);

    if (a > 0)
    {
        printf("It is positive number");
    }
    if (a < 0)
    {
        printf("It is nagative number");
    }

    return 0;
}