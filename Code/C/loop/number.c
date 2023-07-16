#include<stdio.h>
int main()
{
    int i, index=0;
    printf("Enter a number:");
    scanf("\n%d",&i);
    do
    {
       printf("%d\n",index+1);
       index=index+1;
    } while (index<i);
    
    return 0;
}