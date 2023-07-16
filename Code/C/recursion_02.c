#include<stdio.h>
int sum(int x)
{
int s=0;
if (x==0)
{
  return x;
}
s=x+sum(x-1);
return s;
}
void main()
{
    int a;
    printf("Enter a number 1 to n add:");
    scanf("%d",&a);
    a=sum(a);
    printf("%d",a);
   
}