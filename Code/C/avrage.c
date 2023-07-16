#include<stdio.h>
#include<conio.h>
void main()
{
    int a,b,c;
    printf("Enter to integer :");
    scanf("%d %d %d",&a, &b,&c);
    printf("\n Addition is :  %d" ,a+b+c);
    printf("\n Avrage is : %.2f",(a+b+c)/3.0);
    getch();
}