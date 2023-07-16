#include<stdio.h>
int main()
{
    int row,i,j,space;
    printf("Enter a line you want to print star :");        
    scanf("%d",&row);
    for ( i = row; i >=1; i--)
    {

      for (space =1;space<=row-i;space++)
      {
          printf(" ");
      }   
      for ( j = 1; j <=i*2-1; j++)
          {
             printf("*");
          }
          
      
      printf("\n");
      
    }
    
    return 0;
}