#include<stdio.h>
#include<conio.h>
void main()
{
    int a;
    printf("Enter the radiud : ");
    scanf("%d",&a);
    printf("\n The area is : %.2f" , 3.14*a*a);
    printf("\n The surcumfrance is : %.2f" , 3.14*2*a);
    getch();
}