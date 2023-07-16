#include<stdio.h>
int main()
{
    int i,a,sum=0;
    printf("Enter a number and enter tha nagative numbe to sum :");
    
    for ( i = 1;i<=i; i++)
    {
       
       scanf("%d",&a);
       if (a<0)
       {
          break;
       }
       sum=sum+a;
    }
    printf("The sum is :%d",sum);
    return 0;
}