#include <iostream>
using namespace std;
int main()
{
    char arr[100];
    int count = 0;
    printf("enter the string");
    scanf("%s",arr);
    for(int i=0;arr[i]!='\0';i++){
        if(arr[i]!='0' && arr[i]!='1'){
            printf("invalid srting");
            break;
        }
        count++;
    }
    if(arr[count-1]%2==0)
    printf("string accpected");
    else
    printf("not accepted");
}