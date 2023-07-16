#include<stdio.h>
float average(int,int,int);
int main()
{
    int a,b,c;
    float x;
    printf("Enter the 3 number:");
    scanf("%d %d %d",&a,&b,&c);
    x=average(a,b,c);
    printf("the average is : %.2f",x);
    return 0;
}
float average(int i,int j, int k)
{
    float d;
    d=(i+j+k)/3.0;
    return d;

}