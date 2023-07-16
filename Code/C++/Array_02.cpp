#include <iostream>
using namespace std;
int main()
{
    int n;
    cout<<"Enter a size of:";
    cin>>n;
    int A[n];
    A[0]=2;
    for ( int X:A)
    {
        cout<<X<<endl;
    }
    return 0;

}