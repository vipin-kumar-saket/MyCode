#include <iostream>
using namespace std;
int main()
{
    int a;
    cin>>a;
    for(int i=0; i<a;i++)
    {
        int x,r;
        cin>>x;
        if(r=x%10)
        {
            cout<<r<<endl;
        }
        else if(0== x%10){
            cout<<0<<endl;
            
        }
    }
}