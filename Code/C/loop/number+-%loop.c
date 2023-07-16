#include <stdio.h>
int main()
{
    int n, sum = 0;
  
    printf("Enter numbers and press 0 to stop:");
    for( ; ; )
    {
        scanf("%d", &n);
        if(n == 0)
            break;
        if(n < 0)
            continue;
        sum = sum + n;
    }
    printf("Sum is %d", sum);
    return 0;
}
