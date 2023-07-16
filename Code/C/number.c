#include<stdio.h>
int main()
{
    int n,sum=0;
    printf("Enter a number and press 0 to stop: ");
    for ( ; ; )
    {
        scanf("\n%d",&n);
        if (n==0)
        
        break;
        sum=sum+n;
           
    }
     printf("sum=%d",sum);

    return 0;
}