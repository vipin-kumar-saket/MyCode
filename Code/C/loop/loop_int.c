#include<stdio.h>
int main()
{
    int i,a;
    i=1;
    printf("Enter the number :");
    scanf("%d",&a);
    while (i<=a)
    {
       printf("\n%d",i);
       i=i+1;
    }
    
    return 0;
}