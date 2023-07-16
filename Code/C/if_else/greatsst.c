#include<stdio.h>
int main()
{
    int a,b,c;
    printf("Enter a 3 integer");
    scanf("%d %d %d",&a,&b,&c);
    if (a>b)
    
       printf("%d",a);
    else if (b>c)
    
       printf("%d",b);
    else
    printf("%d",c);
    
    return 0;
}