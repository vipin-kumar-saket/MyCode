#include <iostream>
using namespace std;
int main()
{
    int n,x,sum=0,rem;
    cout<<"enter a no you want to check pelindrome or not..";
    cin>>n;
    x=n;

    while(n>0)
    {
        rem=n%10;
         sum=sum*10+rem;
         n=n/10;
    }
    if(sum==x)
    {
        cout<<"it is a pelindrome";
    }
    else 
    cout<<"it is not a pelindrome";
    
}