#include <iostream>
using namespace std;
int main()
{
    int a;
    cin>>a;
    for(int i=0; i<a;i++)
    {
        int x;
        cin>>x;
        
        if(x>=1 && x<=4){
        cout<<"Yes"<<endl;
        }
        else
        {
            cout<<"No"<<endl;
        }
        
    }
}