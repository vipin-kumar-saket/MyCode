#include <stdio.h>
int main()
{
    int a;
    printf("Enter a age :");
    scanf("%d", &a);

    if (a > 18)
    {
        printf("You are eligibal for vot");
    }
    if (a < 18)
    {
        printf("You are not eligibal for vot");
    }

    return 0;
}