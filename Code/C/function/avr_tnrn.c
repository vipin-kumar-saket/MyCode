#include<stdio.h>
void average()
{
    int a,b,c;
    float d;
    printf("Enter a number:");
    scanf("%d %d %d",&a,&b,&c);
    d=(a+b+c)/3.0;
    printf("The average is :%.2f",d);
}
int main()
{
    average();
    return 0;
}