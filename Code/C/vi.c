#include <stdio.h>
int main()
{
    int n, sum = 0,count=0;
  
    printf("Enter numbers and press 0 to stop:");
    for( ; ; )
    {
        scanf("%d", &n);
        if(n == 0)
        
            break;
         count=sum+count;
        if(n > 0)
        
            
        sum = sum + n;
       
        

    }
    printf("Sum is %d", sum);
    printf("\nAvrage is : %.2f",(float)sum/count);
    return 0;
}
