#include <stdio.h>
int main()
{
    int a;
    printf("Enter a number :");
    scanf("%d", &a);

    if (a%2==0)
    {
        printf("It is even number");
    }
    else
    {
        printf("It is odd number");
    }

    return 0;
}