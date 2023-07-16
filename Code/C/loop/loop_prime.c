#include<stdio.h>
int main()
{
    int i,n;
    printf("Enter the number :");
    scanf("%d",&n);
    for (i=2 ; i<=n-1 ; i++)
    {
          if (n==0)
          break;      
    }
    if (i==n)
    {
      printf("The number %d is a prime",n);
    }
    else
    printf("The number %d is not prime",n);
    
    return 0;
}