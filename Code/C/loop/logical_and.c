#include<stdio.h>
int main()
{
    int i,j;
    for ( i = 1, j=0; i<100&&j<3; i++,j++)
    {
      printf("\n%d %d",i,j);
    }
    
    return 0;
}