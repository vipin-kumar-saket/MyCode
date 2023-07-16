#include<stdio.h>
int main()
{
    int i,num,j;
    printf("Enter a number you want a table:");
    scanf("%d",&num);
    printf("The table is %d is:",num);
    for ( i =1; i <=10;i++)
    {
        j=num*i;
        printf("\n%d*%d = %d ",num,i,j);
    }
    
    return 0;
}