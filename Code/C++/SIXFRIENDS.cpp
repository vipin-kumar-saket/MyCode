#include <iostream>
using namespace std;
int main()
{
    int a;
    cin>>a;
    for(int i=0; i<a;i++)
    {
        int x,y;
        cin>>x>>y;
        
        x=x*3;
        y=y*2;
        if(x<y){
            cout<<x<<endl;
        }
        else
        {
            cout<<y<<endl;
        }
        
    }
}