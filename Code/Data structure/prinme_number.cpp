#include <iostream>
using namespace std;
int main()
{
    int a;
    cout<<"Enter a number:";
    cin>>a;
    for(int i=0;i<a;i++){
        if(a%2==0)
        {
            cout<<"It is a not prime number."<<endl;
            break;
        }
        else{
            cout<<"It is a prime number."<<endl;
            break;
        }
    }
}