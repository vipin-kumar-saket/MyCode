#include<stdio.h>
int main()
{
    int n,i,j;
    printf("Enter a line you want to print star :");
    scanf("%d",&n);
    for ( i = 0; i <= n; i++)
    {
      for (j = 0; j <= n; j++)
      {
          printf("*");
      }
      printf("\n");
      
    }
    
    return 0;
}