#include<stdio.h>
float average() //that is function declearation
{
    int a,b,c;
    float d;
    printf("Enter 3 integer:");      //That is all function body
    scanf("%d %d %d",&a,&b,&c);
    d=(a+b+c)/3.0;
    return d;    
}
int main()
{
    float x;
    x=average();                    // And that is function call
    printf("The average is : %.2f",x);
    
    return 0;
}