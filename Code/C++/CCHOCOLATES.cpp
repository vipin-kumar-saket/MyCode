#include <iostream>
using namespace std;
int main()
{
    int a;
    cin>>a;
    for(int i=0;i<a;i++)
    {
        int x,y,z;
        cin>>x>>y>>z;
        cout<<((x*10)+(y*10))/z<<endl;
    }
}