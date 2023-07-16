#include<stdio.h>
int main()
{
    int a,b;
    char ch;
    
    do
    {
       printf("Enter 2 number : ");
       scanf("%d %d",&a,&b);

       printf("The sum is : %d",a+b);
       printf("\nTo continue this condition (y/n):" );
       scanf(" %c",&ch);
    //    There the space for fflush 

    } while (ch=='y');
    

    return 0;
}