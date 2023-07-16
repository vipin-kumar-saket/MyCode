#include<stdio.h>
int main()
{
    int i,j;
    for ( j = 4; j >= 1; j--)
    {
        for (i=4; i>=j; i-- )
        {
            printf("%d",i);
        }
       printf("\n") ;
    }
    
    return 0;
}