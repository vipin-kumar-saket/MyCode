#include<stdio.h>
int main()
{
    int i,j;
    for ( i = 1; i <=4; i++)
    {
       for ( j=0; j<=5; j++)
       {
           printf(" * ",j);
       }
       printf("\n");
    }
    
    return 0;
}