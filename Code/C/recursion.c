#include<stdio.h>
void display(int a){
if (a<1)
{
    return;
}
else
{
    printf("%d",a);
    display(a-1);
     printf("%d",a);

}

}
int main()
{
    int a;
    printf("Enter a number :");
    scanf("%d",&a);
    display(a);
    return 0;
}