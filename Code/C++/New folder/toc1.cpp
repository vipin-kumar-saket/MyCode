#include <stdio.h>
#include<stdlib.h>
using namespace std;
int main()
{
    char arr[100];
    int count =0,count1=0;
    printf("enter the string ");
    scanf("%s",arr);
    for(int i=0;arr[i]!='\0';i++){
        if(arr[i]!='0'&&arr[i]!='1'){
            printf("invalid string");
            exit(0);
        }
        if(arr[i]=='0')
        count++;
        else
        count1++;
    }
    printf("total no. of 1 = %d \n" , count);
    printf("total no. of 0 = %d \n" , count1);
}