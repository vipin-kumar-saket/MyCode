#include<stdio.h>
int main()
{
    int a,b,c;
    printf("Enter 3 integer:");
    scanf(" %d %d %d", &a,&b,&c);
    printf("The sum is : %d",a+b+c);
    printf("\nThe averge is :%.2f",(a+b+c)/3.0);
    return 0;
}