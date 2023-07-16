#include<stdio.h>
int main()
{
    int i,n;
    printf("Enter the number :");
    scanf("%d",&n);
    n=n/2;
    for (i=2 ; i<=n-1 ; i++)
    {
          if (n==0)
          break;      
    }
    if (i==n)
    {
      printf("The number is a prime");
    }
    else
    printf("The number is not prime");
    
    return 0;
}