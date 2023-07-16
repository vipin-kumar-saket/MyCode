#include<stdio.h>
int main()
{
    int arr[20];
    int i ;

    for ( i = 0; i <=9; i++)
    {
       printf("Enter a number :");
       scanf("%d",&arr[i]);
    }
    printf("\n You inputed :");
    for ( i = 0; i <=9 ; i++)
    {
       printf("\n %d ",arr[i]);
    }
    
    
    return 0;
}