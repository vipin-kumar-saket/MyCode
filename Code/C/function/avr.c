#include<stdio.h>
float average() //that is function declearation
{
    int a,i,n,sum=0;
    float d;
    printf("Enter the numbet you want to perfrom:");      //That is all function body
    scanf("%d",&n);
    for ( i = 1; i <=n; i++)
    {
       printf("\nEnter a numer:");
       scanf("%d",&a);
       sum=sum+a;
    }
    d=(float)sum/n;
    
    return d;    
}
int main()
{
    float x;
    x=average();                    // And that is function call
    printf("The average is : %.2f",x);
    
    return 0;
}